package org.example;

public class NumberAnalysis {

    int number = 0;
    boolean isEven = (number % 2 == 0);

    public void numPositiveOrNegative() {
        if (number >= 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }
    }

    public void numEvenOrOdd() {
        if (isEven) {
            System.out.println("This is an even number");
        } else {
            System.out.println("This number is odd");
        }
    }
}
