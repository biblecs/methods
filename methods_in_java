// File: Methods.java
package java_methods;

import java.util.Scanner;

public class Methods {
    public void findLargestAndSmallest() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int largest = num1;
        int smallest = num1;

        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;

        if (num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;

        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.println(largest + " is your largest and " + smallest + " is your smallest number.");
    }

    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.findLargestAndSmallest();
    }
}
