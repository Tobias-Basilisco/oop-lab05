package it.unibo.collections.design.impl;

import it.unibo.collections.design.api.Product;

public class ProductImpl implements Product{
    private static int DEFAULT_QUANTITY = 1;

    private String name;
    private int quantity;

    public ProductImpl(final String name){
        this.name = name;
        this.quantity = DEFAULT_QUANTITY;
    }

    public ProductImpl(final String name, final int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    /**
     * @return the product name
     */
    public String getName(){
        return name;
    }

    /**
     * @return the amount of product
     */
    public double getQuantity(){
        return quantity;
    }
}
