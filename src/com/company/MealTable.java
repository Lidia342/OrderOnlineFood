package com.company;

import javafx.beans.property.SimpleStringProperty;

public class MealTable {
    private SimpleStringProperty idMeal, name, size, price, description, type, quantity;

    public MealTable(SimpleStringProperty idMeal, SimpleStringProperty name, SimpleStringProperty size, SimpleStringProperty price, SimpleStringProperty description, SimpleStringProperty type, SimpleStringProperty quantity) {
        this.idMeal = idMeal;
        this.name = name;
        this.size = size;
        this.price = price;
        this.description = description;
        this.type = type;
        this.quantity = quantity;
    }

    public MealTable(String idMeal, String name, String size, String price, String description, String type, String quantity) {
        this.idMeal = new SimpleStringProperty(idMeal);
        this.name = new SimpleStringProperty(name);
        this.size = new SimpleStringProperty(size);
        this.price = new SimpleStringProperty(price);
        this.description = new SimpleStringProperty(description);
        this.type = new SimpleStringProperty(type);
        this.quantity = new SimpleStringProperty(quantity);
    }

    public String getIdMeal() {
        return idMeal.get();
    }

    public SimpleStringProperty idMealProperty() {
        return idMeal;
    }

    public void setIdMeal(String idMeal) {
        this.idMeal.set(idMeal);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getSize() {
        return size.get();
    }

    public SimpleStringProperty sizeProperty() {
        return size;
    }

    public void setSize(String size) {
        this.size.set(size);
    }

    public String getPrice() {
        return price.get();
    }

    public SimpleStringProperty priceProperty() {
        return price;
    }

    public void setPrice(String price) {
        this.price.set(price);
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public String getType() {
        return type.get();
    }

    public SimpleStringProperty typeProperty() {
        return type;
    }

    public void setType(String type) {
        this.type.set(type);
    }

    public String getQuantity() {
        return quantity.get();
    }

    public SimpleStringProperty quantityProperty() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity.set(quantity);
    }
}

