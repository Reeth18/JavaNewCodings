/*Create a menu-driven command-line-based application in Java to take an integer number N as input from the user and display if the given number is an Even Number or the Odd Number.  */

import java.util.Scanner;

public class evenOddChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char input1;
        do {
            System.out.println("Please enter the Number: ");
            int num = sc.nextInt();
            // Checking whether the Number is Even or Odd.
            if ((num % 2) == 0) {
                System.out.println(num + " is an Even No.");
            } else {
                System.out.println(num + " is an Odd No.");
            }

            // Continue Checking Even or Odd.
            System.out.println("Do you wish to continue?(y/n) ");
            Scanner sc1 = new Scanner(System.in);
            input1 = sc1.next().charAt(0);
        } while (input1 == 'y');
    }
}
