package com.bridgelabz.collectionstream.generics.dynamicmarketplace;

public class DynamicMarketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("The Great Gatsby", 15.99, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Casual Shirt", 29.99, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 499.99, new GadgetCategory());

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        System.out.println("Product Catalog Before Discount:");
        catalog.displayProducts();

        System.out.println("\nApplying Discounts:");
        DiscountManager.applyDiscount(book, 10);
        DiscountManager.applyDiscount(shirt, 20);
        DiscountManager.applyDiscount(phone, 15);

        System.out.println("\nProduct Catalog After Discount:");
        catalog.displayProducts();
    }
}
