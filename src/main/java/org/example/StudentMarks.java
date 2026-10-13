package org.example;

public class StudentMarks {
    int[] marks = {70, 55, 20, 91, 88};
    int total;
    double average;

    public void printMarks() {
        for (int mark : marks) {
            System.out.println(mark);
        }
    }

    public void calcTotal() {
        for (int mark : marks) {
            total += mark;
        }
        System.out.println("Total is: " + total);
    }

    public void calcAverage() {
        average = (double) total / marks.length;
        System.out.println("Average is: " + average);
    }
}
