import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter student name: ");
            String name = input.nextLine();

            System.out.print("Enter grade (0-100): ");
            double grade = Double.parseDouble(input.nextLine());

            System.out.println("\n--- Student Grade Report ---");
            System.out.println("Student: " + name);
            System.out.println("Grade: " + grade);

            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Enter 0-100.");
            } else if (grade >= 90) {
                System.out.println("Remark: Excellent");
            } else if (grade >= 75) {
                System.out.println("Remark: Passed");
            } else {
                System.out.println("Remark: Failed");
            }

        } catch (NumberFormatException e) {
            System.out.println(
                "Error: Please enter a valid numeric grade."
            );
        } finally {
            input.close();
        }
    }
}
