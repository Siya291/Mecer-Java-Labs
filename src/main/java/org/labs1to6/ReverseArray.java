package org.labs1to6;

public class ReverseArray {
    int[] numbers = {10, 20, 30, 40, 50, 60};

    public void printReverseOnly() {
        System.out.print("Array printed in reverse: ");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + ", ");
        }
    }
}
