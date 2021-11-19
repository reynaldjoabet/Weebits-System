package com.Weebits.models;

import java.util.List;
import java.util.UUID;

public class Cart {
    private UUID cartId;
    private List<Product> products;

    /**
     *
     */
    public Cart(){
        this.cartId= UUID.randomUUID();
        this.products=null;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }
}
