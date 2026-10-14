package org.example;

import java.util.ArrayList;

public class EvenOddArray {
    int[] numbers = {12, 21, 34,47, 59, 66, 77};

    public void processEvenAndOdd() {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }
//        for (int i = 0; i<=numbers.length;i++){
//            if (i % 2==0){
//                evenNumbers.add(i);
//            } else {
//                oddNumbers.add(i);
//            }
//        }

        System.out.println("--- COUNTS ---");
        System.out.println("Number of even values: " + evenNumbers.size());
        System.out.println("Number of odd values: " + oddNumbers.size());

        System.out.println("--- SEPARATED LISTS ---");
        System.out.println("Even values array list: " + evenNumbers);
        System.out.println("Odd values array list: " + oddNumbers);
    }
}