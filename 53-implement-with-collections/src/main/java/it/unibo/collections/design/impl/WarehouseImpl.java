package it.unibo.collections.design.impl;

import it.unibo.collections.design.api.Product;
import it.unibo.collections.design.api.Warehouse;
import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse{

    private LinkedHashSet<Product> products;

    /**
     * Adds a product, assuming there is no other with same name already there.
     *
     * @param p
     *            the product to add
     */
    public void addProduct(Product p){
        products.add(p);
    }

    /**
     * This method allows to get all the registered product names. It can be
     * used safely: a change in the returned {@link Set} will not be reflected
     * in the warehouse (it creates a defensive copy).
     *
     * @return a collection of all registered products names.
     */
    public Set<String> allNames(){
        return null;
    }

    /**
     * This method allows to get all the registered products. It can be used
     * safely: a change in the returned {@link Set} will not be reflected in the
     * warehouse (it creates a defensive copy).
     *
     * @return a collection of all registered products.
     */
    public Set<Product> allProducts(){
        return this.products;
    }

    /**
     * This method checks whether a product is stored in the {@link Warehouse}.
     * It must run in constant time.
     *
     * @param p
     *            the product
     * @return true if the {@link Warehouse} contains the {@link Product}.
     */
    public boolean containsProduct(Product p){
        return false;
    }

    /**
     * Given a product, returns its quantity in stock.
     *
     * @param name
     *            the product's name
     * @return the amount of the product with that name, or -1 if it is not
     *         there
     */
    public double getQuantity(String name){
        return 0;
    }

}
