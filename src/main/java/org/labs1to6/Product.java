package org.labs1to6;

public class Product {

    String productID;
    String productName;
    double productPrice;
    int stockQuantity;
    int stockAvailability;

    public Product(String productID, String productName, double productPrice, int stockQuantity, int stockAvailability) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.stockQuantity = stockQuantity;
        this.stockAvailability = stockAvailability;
    }

    void displayStock(){
        addStock(50);
        calcStockValue();
        reduceStock();

    }
    void addStock(int numAddedStock) {
        stockAvailability = stockAvailability + numAddedStock;
        System.out.println("Added stock by " + numAddedStock + ", available stock: " + this.stockAvailability);

    }
    void reduceStock() {
        if ((stockAvailability - stockQuantity) > 0){
            stockAvailability = stockAvailability - stockQuantity;
            System.out.println("Reduced stock by " + this.stockQuantity + " , available stock: " + this.stockAvailability);
        } else {
            System.out.println("No stock available");
        }

    }

     void calcStockValue(){
        double stockValue;

        if (stockAvailability >= stockQuantity){
            stockValue = productPrice * stockQuantity;
            System.out.println("The stock value is: " + stockValue);
        } else {
            System.out.println("We are out of stock");
        }
    }
}
