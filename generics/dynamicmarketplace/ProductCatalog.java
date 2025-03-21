package com.bridgelabz.collectionstream.generics.dynamicmarketplace;

import java.util.ArrayList;
import java.util.List;

class ProductCatalog {
    private List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product<?> product : products) {
            System.out.println(product);
        }
    }
}