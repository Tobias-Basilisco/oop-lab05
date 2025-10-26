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

    @Override
    public final int hashCode() {
        return name.hashCode();
    }

    
    @Override
    public boolean equals(final Object obj){
        return obj == this 
                || obj instanceof ProductImpl p
                && p.getClass().equals(this.getClass())
                && p.getName().equals(this.getName());
    }
    
    @Override
    public String toString() {
        return "Product[name: " + name + ", quantity: " + quantity + "]";
    }

}
