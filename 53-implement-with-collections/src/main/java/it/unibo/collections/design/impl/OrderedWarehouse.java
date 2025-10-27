package it.unibo.collections.design.impl;

import java.util.TreeSet;

import it.unibo.collections.design.api.Product;

import java.util.Set;

public class OrderedWarehouse extends WarehouseImpl{
    
    @Override
    public Set<Product> allProducts(){
        return new TreeSet<>(super.allProducts());
    }
}
