package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
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

    }
}
