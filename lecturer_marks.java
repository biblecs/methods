// File: LecturerMarks.java
package lecturer_marks_package;

import java.util.Scanner;

public class LecturerMarks {
    public void computeAverageMarks() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for Java Programming:");
        int javaMarks = scanner.nextInt();
        System.out.println("Enter marks for Networking:");
        int networkingMarks = scanner.nextInt();
        System.out.println("Enter marks for Maths:");
        int mathsMarks = scanner.nextInt();

        double average = (javaMarks + networkingMarks + mathsMarks) / 3.0;

        System.out.println("Marks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + average);
    }

    public static void main(String[] args) {
        LecturerMarks marks = new LecturerMarks();
        marks.computeAverageMarks();
    }
}
