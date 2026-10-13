package org.example;

public class Student {
    String name;
    String studentNumber;
    double mark;

    public Student(String name, String studentNumber, double mark) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.mark = mark;
    }

    public void displayDetails() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Student Mark: " + mark);
        System.out.println("Is the mark is at least 50? : " + hasPassed());

    }

    public boolean hasPassed() {
        if (mark >= 50) {
            return true;
        }
        return false;
    }
}
