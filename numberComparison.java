/*WAP in Java to take three integer numbers as input from the user. And find below values - 
The Smallest Number
The Largest Number 
Average of all three numbers*/

import java.util.Scanner;

public class numberComparison {
    public static void main(String[] args) {
        // Taking 3 numbers as user input
        System.out.println("Enter the First Number: ");
        Scanner sc1 = new Scanner(System.in);
        double num1 = sc1.nextDouble();

        System.out.println("Enter the Second Number: ");
        Scanner sc2 = new Scanner(System.in);
        double num2 = sc2.nextDouble();

        System.out.println("Enter the Third Number: ");
        Scanner sc3 = new Scanner(System.in);
        double num3 = sc3.nextDouble();

        // Counting the Average of 3 numbers
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average of the Three Numbers is: " + average);

        // Check the Largest and the Smallest Number

        // Taking a Third Variable max
        // Finding the Largest Number
        double max = num1;
        if (num2 > max) {
            max = num2;
        } else if (num3 > max) {
            max = num3;
        }
        System.out.println("Largest Number among " + num1 + ", " + num2 + " & " + num3 + "is: " + max);

        // Taking a Third Variable min
        // Finding the Smallest Number
        double min = num1;
        if (num2 < min) {
            min = num2;
        } else if (num3 < min) {
            min = num3;
        }
        System.out.println("Smallest Number among " + num1 + ", " + num2 + " & " + num3 + "is: " + min);
    }
}
