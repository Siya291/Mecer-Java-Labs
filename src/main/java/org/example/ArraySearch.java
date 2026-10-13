package org.example;

public class ArraySearch {
    int[] numbers = {10, 20, 30, 40, 40, 50};
    int searchValue = 40;

    public void searchArrNumbers() {
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchValue) {
                System.out.println("Target value " + searchValue + " found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Value not found");
        }
    }
}