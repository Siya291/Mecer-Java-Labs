package campusStore;

public class Main {
    static void main() {

        Product product = new Product("HP_929", "HP LAPTOP", 7999, 12, 10);
        Product product1 = new Product("L_717", "Lenovo LAPTOP", 6999, 2, 10);
        Product product2 = new Product("IOS_002", "IOS LAPTOP", 10999,3, 10);
        Product product3 = new Product("SM_040", "Samsung LAPTOP", 5999,4, 10);
        Product product4 = new Product("HW_685", "HUAWEI LAPTOP", 20999, 5, 1);

        Product[] products = {product, product1, product2, product3, product4};

        double subTotal = 0.0;

        System.out.print("-----------Products------------");
        for(Product _Products: products) {
            _Products.displayProducts();
            subTotal += _Products.calcLineTotal();
        }
        System.out.print("--------------------------------");
        System.out.printf("\nThe sub total for products is: R%.2f", subTotal);
        System.out.print("\n--------------------------------");

        String searchStr = "HP_929";
        Product findProduct = null;
        for (Product _product: products) {
            if (_product.getProductID().equalsIgnoreCase(searchStr) ||
            _product.getProductName().equalsIgnoreCase(searchStr)) {
                findProduct = _product;
                break;
            }
        }
        if (findProduct == null) {
            System.out.print("Product not found");
        }
        System.out.print("\nProduct found: " + findProduct.getProductName());

    }
}
