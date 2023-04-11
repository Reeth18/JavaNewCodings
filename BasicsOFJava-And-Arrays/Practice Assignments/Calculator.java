import java.util.Scanner;

interface Operation {
    public double method(double num1, double num2);
}

abstract class DecimalOperation implements Operation {
    protected double num1;
    protected double num2;

    public DecimalOperation(double x, double y) {
        this.num1 = x;
        this.num2 = y;
    }

}

class Addition extends DecimalOperation {

    public Addition(double x, double y) {
        super(x, y);
    }

    public double method(double num1, double num2) {
        double Addition = num1 + num2;
        return Addition;
    }

}

class Subtraction extends DecimalOperation {

    public Subtraction(double x, double y) {
        super(x, y);
    }

    public double method(double num1, double num2) {
        double Subtraction = num1 - num2;
        return Subtraction;
    }
}

class Multiplication extends DecimalOperation {

    public Multiplication(double x, double y) {
        super(x, y);
    }

    public double method(double num1, double num2) {
        double Multiplication = num1 * num2;
        return Multiplication;
    }
}

class Division extends DecimalOperation {

    public Division(double x, double y) {
        super(x, y);
    }

    public double method(double num1, double num2) {
        double Division = num1 / num2;
        return Division;
    }

}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(:----------Welcome to the Calculator App----------:)");

        while (true) {
            System.out.println("Please Select any operation from the List Below");
            System.out.println("1.Press 1 for Addition");
            System.out.println("2.Press 2 for Subtraction");
            System.out.println("3.Press 3 for Multiplication");
            System.out.println("4.Press 4 for Division");
            System.out.println("5.Press 5 for Exit");

            System.out.print("Enter Your Choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the Calculator App...");
                System.out.println("Thanks for Using the Calculator App :)");
                break;
                // System.out.println("Thanks for Using the Calculator App:)");
            }

            System.out.println("Enter the First Number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the Second Number: ");
            double num2 = scanner.nextDouble();

            Operation operation = null;

            switch (choice) {
                case 1:
                    operation = new Addition(num1, num2);
                    break;

                case 2:
                    operation = new Subtraction(num1, num2);
                    break;

                case 3:
                    operation = new Multiplication(num1, num2);
                    break;

                case 4:
                    operation = new Division(num1, num2);
                    break;

                default:
                    System.out.println("Invalid Choice");
                    continue;
            }
            System.out.println("The Result is: " + operation.method(num1, num2));
        }
        scanner.close();
    }
}
