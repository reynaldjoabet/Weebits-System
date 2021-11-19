package com.Weebits.models;

/**
 *
 */
public class Product {
    private ProductId productId;
    private  String model;
    private String category;
    private  String description;
    private  double price;

    public Product(ProductId productId, String model, String category, String description, double price){
        this.productId = productId;
        this.model=model;
        this.price=price;
        this.description=description;
        this.category=category;
    }

    public double getPrice() {
        return price;
    }

    public ProductId getItemId() {
        return productId;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getModel() {
        return model;
    }
}
