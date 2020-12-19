package com.example.netrunners;

public class MyProduct {
    private int Id;
    private int image;
    private String name;
    private String category;
    private double price;
    private int stock;

    public MyProduct(int Id, int image, String name, String category, double price, int stock) {
        this.Id = Id;
        this.image = image;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public MyProduct(int image, String name, String category, double price) {
        this.image = image;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return Id;
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

}
