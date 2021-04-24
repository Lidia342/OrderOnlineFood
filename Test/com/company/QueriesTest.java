package com.company;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class QueriesTest {

    private ObservableList<Object> obList = FXCollections.observableArrayList();
    ResultSet rs;
    Connection connection;

    @Test
    void viewMealsTable() {


        String selectQuery = "SELECT * FROM meals;";

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",
                    "root", "NAod1273");
            rs = connection.createStatement().executeQuery(selectQuery);
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        while (true) {
            try {
                if (!rs.next())
                    break;
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            MealTable pt = new MealTable("idMeal", "name",
                    "size", "price", "description", "type", "quantity");

            try {
                pt.setIdMeal(rs.getString("idMeal"));
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            try {
                pt.setName(rs.getString("name"));
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            try {
                pt.setSize(rs.getString("size"));
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            try {
                pt.setPrice(rs.getString("price"));
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            try {
                pt.setDescription(rs.getString("Description"));
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            try {
                pt.setType(rs.getString("Type"));
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            obList.add(pt);
            setObList(obList);
        }
    }
    public ObservableList<Object> getObList() {
        return obList;
    }

    public void setObList(ObservableList<Object> obList) {
        this.obList = obList;
    }


}