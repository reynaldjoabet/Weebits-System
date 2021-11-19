package com.Weebits.models;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.UUID;



public class Order {
    private LocalDateTime deliveryTime;
   private UUID orderId;
   private UUID paymentId;
   private HashMap<ProductId,Integer>items;
   private  OrderStatus orderStatus;
   private  double totalCost;

    /**
     *
     */
   public Order(HashMap<ProductId,Integer> items, double total){
       this.deliveryTime= LocalDateTime.now().plusMinutes(40);
      this.items= items;
      this.orderId=UUID.randomUUID();
      this.totalCost=total;
      this.paymentId=UUID.randomUUID();
      this.orderStatus=OrderStatus.PLACED;

   }

    public double getTotalCost() {
        return totalCost;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public UUID getPaymentId() {
        return paymentId;
    }

    public HashMap<ProductId, Integer> getItems() {
        return items;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void updateOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
