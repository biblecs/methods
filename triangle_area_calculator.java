// File: Triangle.java
package triangle_package;

import java.util.Scanner;

public class Triangle {
    private double base;
    private double height;

    public Triangle() {
        this.base = 0;
        this.height = 0;
    }

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base of the triangle:");
        this.base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle:");
        this.height = scanner.nextDouble();
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

    public void displayArea() {
        double area = calculateArea();
        System.out.println("The area of the triangle is: " + area);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.getUserInput();
        triangle.displayArea();
    }
}
