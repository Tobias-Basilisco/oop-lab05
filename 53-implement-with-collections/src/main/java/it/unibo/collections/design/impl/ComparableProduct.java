package it.unibo.collections.design.impl;

import it.unibo.collections.design.api.Product;

public class ComparableProduct extends ProductImpl implements Comparable<Product>{
    
    public ComparableProduct(final String name, final int quantity){
        super(name, quantity);
    }

    public ComparableProduct(final String name){
        super(name);
    }

    public int compareTo(final Product product){
        return getName().compareTo(product.getName());
    }
}
