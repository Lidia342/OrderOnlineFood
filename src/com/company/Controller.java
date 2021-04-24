package com.company;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

public class Controller {
    @FXML
    private TableView<Object> table;
    @FXML
    private TableColumn<MealTable, String> ssncol;
    @FXML
    private TableColumn<MealTable, String> firstnamecol;
    @FXML
    private TableColumn<MealTable, String> lastnamecol;
    @FXML
    private TableColumn<MealTable, String> dobcol;
    @FXML
    private TableColumn<MealTable, String> gendercol;
    @FXML
    private TableColumn<MealTable, String> gendercole;


    @FXML
    public void handleView() throws SQLException {

        ssncol.setCellValueFactory(new PropertyValueFactory<>("idMeal"));
        firstnamecol.setCellValueFactory(new PropertyValueFactory<>("name"));
        lastnamecol.setCellValueFactory(new PropertyValueFactory<>("size"));
        dobcol.setCellValueFactory(new PropertyValueFactory<>("price"));
        gendercol.setCellValueFactory(new PropertyValueFactory<>("description"));
        gendercol.setCellValueFactory(new PropertyValueFactory<>("type"));
      //  Queries pq = new Queries();
       // pq.viewMealsTable();

        //table.setItems(pq.getObList());

    }
}
