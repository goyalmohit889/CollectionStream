package com.bridgelabz.collectionstream.generics.smartwarehouse;

public class SmartWarehouseSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apple"));
        groceriesStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("Electronics in Storage:");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries in Storage:");
        Storage.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture in Storage:");
        Storage.displayItems(furnitureStorage.getItems());
    }
}

