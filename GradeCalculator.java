
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your grade: ");
        double grade = input.nextDouble();

        System.out.println("\n--- Grade Result ---");
        System.out.println("Student: " + name);
        System.out.println("Grade: " + grade);

        if (grade >= 90 && grade <= 100) {
            System.out.println("Remark: Excellent");
        } else if (grade >= 75 && grade < 90) {
            System.out.println("Remark: Passed");
        } else if (grade >= 0 && grade < 75) {
            System.out.println("Remark: Failed");
        } else {
            System.out.println("Invalid grade. Enter 0-100.");
        }

        input.close();
    }
}
