package com.bridgelabz.collectionstream.generics.dynamicmarketplace;

abstract class Category {
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

