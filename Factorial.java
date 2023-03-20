import java.util.Scanner;;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int fact = 1;
        System.out.println("Factorial of " + num + " is: ");
        for (int i = 1; i <= num; i++) {
            fact = (fact * i);
        }
        System.out.print(fact);
    }
}
