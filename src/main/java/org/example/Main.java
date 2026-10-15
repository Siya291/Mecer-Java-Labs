package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        StudentDetails studentDetails = new StudentDetails();
        studentDetails.getStudentDetails();

        ShoppingTotal shoppingTotal = new ShoppingTotal();
        shoppingTotal.getShoppingTotal();

        TemperatureConversion temperatureConversion = new TemperatureConversion();
        temperatureConversion.getFahrenheitAndCelcius();

        PassOrFail passOrFail = new PassOrFail();
        passOrFail.getMark();

        GradeCalculator gradeCalculator = new GradeCalculator();
        gradeCalculator.gradeMarkCalc();

        NumberAnalysis numberAnalysis = new NumberAnalysis();
        numberAnalysis.numPositiveOrNegative();
        numberAnalysis.numEvenOrOdd();

        LoginCheck loginCheck = new LoginCheck();
        loginCheck.loginValidation();

        StudentMarks studentMarks = new StudentMarks();
        studentMarks.printMarks();
        studentMarks.calcTotal();
        studentMarks.calcAverage();

        ArrayStatistics arrayStatistics = new ArrayStatistics();
        arrayStatistics.findNumbersOverFifty();
        arrayStatistics.findLargeSmallValue();
        arrayStatistics.totalElement();

        ArraySearch arraySearch = new ArraySearch();
        arraySearch.searchArrNumbers();

        EvenOddArray evenOddArray = new EvenOddArray();
        evenOddArray.processEvenAndOdd();

        ReverseArray reverseArray = new ReverseArray();
        reverseArray.printReverseOnly();

        Student student1 = new Student("Siyabonga", "ST218253974", 88);
        Student student2 = new Student("Ditebogo", "ST218274634", 41);
        student1.displayDetails();
        student2.displayDetails();

        BankAccount bankAccount = new BankAccount("Siyabonga", 14142343, 3000);
        bankAccount.getBalance();

        Product product = new Product("VC_123", "Vanilla cake", 159.99, 37, 30);
        product.displayStock();

        Rectangle rectangle = new Rectangle(45.2, 23.9);
        Rectangle rectangle2 = new Rectangle(23.88, 13.4);
        rectangle.displayResults();
        rectangle2.displayResults();

        Student2 student = new Student2("Siyabonga", "ST218253974", new int[]{77, 55, 88});
        Student2 students1 = new Student2("Lona", "ST21857e965", new int[]{40, 35, 68});
        Student2 students2 = new Student2("Ditebogo", "ST265343567", new int[]{60, 45, 68});
        student.displaySummery();
        students1.displaySummery();
        students2.displaySummery();

        Product2 products1 = new Product2("AP_001", "Apple", 34.99, 7);
        Product2 products2 = new Product2("P_001", "Peers", 24.99, 25);
        Product2 products3 = new Product2("G_001", "Grapes", 44.99, 5);
        Product2 products4 = new Product2("O_001", "Oranges", 14.99, 9);

        double subTotal = 0.0;
        double discountPercentage = 0.1;
        double finalTotal;

        System.out.println("\n---------- Receipt ----------");

        Product2[] products = {products1, products2, products3, products4};
        for (Product2 _Products : products) {
            _Products.displayReceipt();
            subTotal += _Products.calcLineTotal();
        }
        System.out.println("-----------------------------");
        System.out.printf("The sub total for products is: R%.2f\n", subTotal);
        if (subTotal >= 1000) {
            finalTotal = subTotal - (subTotal * discountPercentage);
            System.out.printf("You qualify for a discount for spending R1000 or more, the final amount due is R%.2f", finalTotal);
        }
    }
}
