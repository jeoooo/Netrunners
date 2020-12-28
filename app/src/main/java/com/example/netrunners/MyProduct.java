package com.example.netrunners;

public class MyProduct {
    private int id;
    private int image;
    private String name;
    private String category;
    private double price;
    private int stock;
    private int quantity;
    private int cart_id;
    private String description;
    private int checkbox;

    // ArrayList to store the data temporarily from the table
    public MyProduct(int id, int image, String name, String category, double price, int stock, String description) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.description = description;
    }

    // Used to store the all the data from MyData class to SQLite product table
    public MyProduct(int image, String name, String category, double price, String description) {
        this.image = image;
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
    }

    // Temporarily store the data from SQLite cart table
    public MyProduct(int cart_id, int id, int image, String name, String category, double price, int quantity, int checkbox) {
        this.cart_id = cart_id;
        this.id = id;
        this.image = image;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.checkbox = checkbox;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCheckbox(int checkbox) {
        this.checkbox = checkbox;
    }

    public int getCheckbox() {
        return checkbox;
    }

    public int getId() {
        return id;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getCart_Id() {
        return cart_id;
    }

    public String getDescription() {
        return description;
    }

}
