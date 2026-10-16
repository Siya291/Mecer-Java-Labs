package campusStore;

public class Product {

    private String productID;
    private String productName;
    private double productPrice;
    private int quantity;
    private int stockAvailability;

    public Product(String productID, String productName, double productPrice, int quantity, int stockAvailability) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.stockAvailability = stockAvailability;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    void displayProducts() {
        System.out.print("\n");
        addStock(0);
        System.out.print("Product ID is: " + this.productID);
        System.out.print("\nProduct name is: " + this.productName);
        System.out.print("\nProduct price is R" + this.productPrice);
        System.out.print("\nStock Quantity is: " + this.quantity + "\n");
        calcLineTotal();
        calcStockValue();
        reduceStock();
    }

    double calcLineTotal() {

        return productPrice * quantity;
    }

    void addStock(int numAddedStock) {
        stockAvailability = stockAvailability + numAddedStock;
        System.out.println("Added stock by " + numAddedStock + ", available stock: " + this.stockAvailability);

    }
    void reduceStock() {
        if ((stockAvailability - quantity) > 0){
            stockAvailability = stockAvailability - quantity;
            System.out.println("Reduced stock by " + this.quantity + " , available stock: " + this.stockAvailability);
        } else {
            System.out.println("No stock available");
        }

    }

    void calcStockValue(){
        double stockValue;

        if (stockAvailability >= quantity){
            stockValue = productPrice * quantity;
            System.out.println("The total price is: " + stockValue);
        } else {
            System.out.println("We are out of stock");
        }
    }
}
