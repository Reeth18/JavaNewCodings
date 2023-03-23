import java.util.Arrays;

public class uniqueNumbers {
    public static void main(String[] args) {
        int[] arrNum = { 1, 2, 2, 1, 6, 6, 1, 5, 6, 5, 6 };

        // Sort the array
        Arrays.sort(arrNum);

        // Initialize variables to store the current number and its frequency
        int currNum = arrNum[0];
        int currFreq = 1;

        // Print the unique numbers and their frequencies
        System.out.println("Unique Numbers and their frequencies => ");
        for (int i = 1; i < arrNum.length; i++) {
            if (arrNum[i] == currNum) {
                currFreq++;
            } else {
                System.out.println(currNum + ": " + currFreq + " times");
                currNum = arrNum[i];
                currFreq = 1;
            }
        }
        // Prints the last number i.e., 6: 4 times
        System.out.println(currNum + ": " + currFreq + " times");
    }

}
