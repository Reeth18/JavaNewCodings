import java.util.Scanner;

public class primeNotPrime {

    public static void main(String[] args) {

        System.out.println("Enter any No.: ");
        // Taking User Input
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Holds the count of values
        int count = 0;

        // Numbers <= 1 are not considered as either Prime or Composite
        if (num <= 1) {
            System.out.println("The number " + num + " is neither a prime nor a composite.");
            return;
        }

        // For Loop to count the No of Factors/Multiples
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // If the No of Factors/Multiples are > 1 then it is a Composite Number
        // if the num is divided by 2.
        if (count > 1) {
            System.out.println("The number " + num + " is a composite number.");
        } else {
            System.out.println("The number " + num + " is a prime number.");
        }
    }
}
