import java.util.Arrays;
import java.util.Collections;

public class sortArrays {
    public static void main(String[] args) {
        int[] array = { 10, 6, 4, 13, 9, 18, 14, 12 };
        Arrays.sort(array);
        System.out.println("Sorted Array is: " + Arrays.toString(array));

        // Partial Sorting
        int[] newArray = { 10, 6, 4, 11, 7, 16, 18, 10 };
        Arrays.sort(newArray, 0, 5);
        System.out.println("Partially Sorted Array is: " + Arrays.toString(newArray));
    }
}