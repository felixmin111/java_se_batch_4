package org.example.Day17.model;

import org.example.Day17.annotation.NonNegativeField;
import org.example.Day17.annotation.NotNullField;

public class Product {
    private Integer id;

    @NotNullField(message="Product name cannot be null...!")
    private String name;

    @NotNullField(message="Product price cannot be null...!")
    @NonNegativeField(message = "Product Price must be grater than zero..!")
    private double price;

    @NotNullField(message="Product quantity cannot be null..!")
    @NonNegativeField(message = "Product quantity must be grater than zero..!")
    private int quantity;

    private ProductCategory productCategory;

    public Product(Integer id, String name, double price, int quantity, ProductCategory productCategory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.productCategory = productCategory;
    }
    public Product(Integer id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
}
