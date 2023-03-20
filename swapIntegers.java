public class swapIntegers {
    public static void main(String[] args) {
        int num1 = 63;
        int num2 = 15;

        System.out.println("Before Swapping the Numbers are");
        System.out.println("Original Num1= " + num1);
        System.out.println("Original Num2= " + num2);
        // Swapping the two numbers
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping the Numbers are");
        System.out.println("Swapped Num1 = " + num1);
        System.out.println("Swapped Num2 = " + num2);
    }
}
