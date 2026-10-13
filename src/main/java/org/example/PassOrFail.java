package org.example;

public class PassOrFail {

    public void getMark() {
        int mark = 102;

        System.out.println("");
        if (mark < 0 || mark > 100) {
            System.out.println("Mark must be between 0 and 100");
        } else if (mark >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
