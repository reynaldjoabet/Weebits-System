package com.Weebits.models;

import java.util.List;

public class Customer {
    private String name;
    private Address address;
    private List<Order> orderHistory;
    private String username;
    private  String email;
    private  String password;

    /**
     *
     */
     public  Customer(String name, String username, String email,String password){
         this.address= new Address("default","beau Plan","2100");
         this.email=email;
         this.username=username;
         this.name=name;
         this.orderHistory=null;
         this.password=password;
     }

    public void setOrderHistory(List<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }

    public Address getAddress() {
        return address;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }
    public boolean validatePassword(String password){
         if(this.password==password){
             return  true;
         } else {
             return  false;
         }
    }
}
