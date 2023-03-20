import java.util.Scanner;

public class percentageGpa {
    public static void main(String[] args) {
        System.out.print("Enter the Marks Obtained by the Student: ");
        Scanner sc = new Scanner(System.in);
        double marksObtained = sc.nextDouble();
        double totalMarks = 700;

        // Calculate the Percentage
        double percentage = (marksObtained / totalMarks) * 100;
        System.out.println("Percentage Marks: " + percentage);

        if (percentage >= 90 || percentage <= 100) {
            System.out.println("Grade=A, GPA=4.0");
        } else if (percentage >= 80 || percentage <= 89) {
            System.out.println("Grade=B, GPA=3.0");
        } else if (percentage >= 70 || percentage <= 79) {
            System.out.println("Grade=C, GPA=2.0");
        } else if (percentage >= 60 || percentage <= 69) {
            System.out.println("Grade=D, GPA=1.0");
        } else if (percentage >= 31 || percentage <= 59) {
            System.out.println("Grade=F, GPA=0.0");
        }

    }
}
