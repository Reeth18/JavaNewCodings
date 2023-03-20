import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter any Integer No.: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 12;
        for (int i = 0; i <= count; i++) {
            int Table = (i * num);
            System.out.println("Multiplication Table of " + num + " * " + i + " is= " + Table);
        }
    }
}
