package org.example;

public class ShoppingTotal {

    public void getShoppingTotal() {
        String prodName = "Laptop(s)";
        double prodPrice = 11500.99;
        int quantity= 3;
        double totalPrice;
        double discountPercentage = 30;
        double finalAmt;

        totalPrice = prodPrice * quantity;
        finalAmt = totalPrice * (1 - (discountPercentage / 100.00));


        System.out.println("Total price for " + prodName + " is R" + totalPrice);
        System.out.printf("With the applied discount the Final Amount is: R%.2f", finalAmt);
        System.out.println("");

    }
}
