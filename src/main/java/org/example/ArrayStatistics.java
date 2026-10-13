package org.example;

public class ArrayStatistics {
    int[] numbers = {50, 66, 88, 20, 45, 90};
    int largest = numbers[0];
    int smallest = numbers[0];
    int countAbove50 = 0;
    int totalElements = numbers.length;

    public void findNumbersOverFifty() {
        for (int num : numbers) {
            if (num >= 50) {
                countAbove50++;
            }
        }
        System.out.println("Values greater than or equal to 50: " + countAbove50);
    }

    public void findLargeSmallValue() {

        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }

            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Largest value: " + largest);
        System.out.println("Smallest value: " + smallest);
    }

    public void totalElement() {
        System.out.println("Number of elements are : " + totalElements);
    }
}