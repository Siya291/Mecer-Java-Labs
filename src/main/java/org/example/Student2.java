package org.example;

import java.util.Arrays;

public class Student2 {
    String name;
    String studentNumber;
    int[] arrMarks;

    public Student2(String name, String studentNumber, int[] arrMarks) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.arrMarks = arrMarks;
    }

    double calcAverage() {
        double avgMark = 0.0;

        for (int num : arrMarks) {
            if (num < 0 || num > 100) {
                System.out.println("Error: Invalid mark found (" + num + "). Cannot calculate average.");
                return -1;
            }
        }

        if (arrMarks.length > 2) {
            avgMark = (double) (Arrays.stream(arrMarks).sum()) / arrMarks.length;

        } else {
            System.out.println("Invalid number of marks added");
        }

        return avgMark;
    }

    void avgHasPassed() {
        if (calcAverage() >= 50) {
            System.out.println("Student has passed");
        } else {
            System.out.println("Student has failed");
        }
    }

    void displaySummery() {
        System.out.println("\n--------STUDENT DETAILS----------");
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Number: " + this.studentNumber);
        System.out.println("Student Average is: " + calcAverage());
        avgHasPassed();
    }
}
