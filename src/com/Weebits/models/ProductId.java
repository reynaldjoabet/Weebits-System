package com.Weebits.models;

import java.util.UUID;

/**
 *
 */
public class ProductId {;
    private UUID itemId;
    public ProductId(){
        this.itemId=UUID.randomUUID();
    }

    public UUID getItemId() {
        return itemId;
    }
}
