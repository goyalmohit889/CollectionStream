package com.bridgelabz.collectionstream.generics.dynamicmarketplace;

class DiscountManager {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
        System.out.println("Applied " + percentage + "% discount on " + product.getName() + ". New Price: $" + product.getPrice());
    }
}