/* WAP in Java to print asterisks (*) in the Triangle pattern as shown below.

*

* * *

* * * * *

* * *

* 

*/

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        // Printing the No of rows
        System.out.println("Enter the Number of Rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        // Traversing i as rows and j as columns
        int i, j;
        // Forward Loop
        // Outer Loop
        for (i = 0; i < rows; i += 2) {
            // Inner Loop
            for (j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }

        // Backward Loop
        for (i = rows - 1; i >= 0; i -= 2) {
            for (j = 0; j < i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }

    }
}
