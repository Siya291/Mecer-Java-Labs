package org.example;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    void displayResults() {
        calcArea();
        calcPerimeter();
    }

    void calcArea(){
        double area;
        area = width * height;
        System.out.println("The Area for width: " + this.width + " and the height: " + this.height + " is " + area );
    }

    void calcPerimeter() {
        double perimeter;
        perimeter = 2 * (width + height);
        System.out.println("The Perimeter for width: " + this.width + " and the height: " + this.height + " is " + perimeter );
    }
}
