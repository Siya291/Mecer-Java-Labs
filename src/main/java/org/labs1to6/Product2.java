package org.labs1to6;

public class Product2 {
    String productID;
    String productName;
    double productPrice;
    int stockQuantity;

    public Product2(String productID, String productName, double productPrice, int stockQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.stockQuantity = stockQuantity;
    }

    void displayReceipt() {
        System.out.printf("Line Total: R%.2f\n", calcLineTotal());
    }

    double calcLineTotal() {
        return productPrice * stockQuantity;
    }
}
