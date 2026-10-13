package org.example;

public class GradeCalculator {

    public void gradeMarkCalc() {
        int gradeMark = 91;

        if (gradeMark < 0 || gradeMark > 100) {
            System.out.println("Mark must be between 0 and 100");
        } else if (gradeMark >= 50 && gradeMark <= 69) {
            System.out.println("Pass");
        } else if (gradeMark >= 70 && gradeMark <= 79) {
            System.out.println("Merit");
        } else if (gradeMark >= 80 && gradeMark <= 100) {
            System.out.println("Distinction");
        } else {
            System.out.println("Fail");
        }
    }
}
