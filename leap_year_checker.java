// File: LeapYearChecker.java
package leap_year_package;

import java.util.Scanner;

public class LeapYearChecker {
    public void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println("The year you entered is a leap year.");
        } else {
            System.out.println("The year you entered is not a leap year.");
        }
    }

    public static void main(String[] args) {
        LeapYearChecker checker = new LeapYearChecker();
        checker.checkLeapYear();
    }
}
