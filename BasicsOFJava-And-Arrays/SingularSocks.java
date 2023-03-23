public class SingularSocks {
    public static void main(String[] args) {
        int[] arrNum = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
        int[] counts = new int[101]; // assuming sock IDs range from 1 to 100
        int singularCount = 0;

        // Count the number of socks with each ID
        for (int i = 0; i < arrNum.length; i++) {
            counts[arrNum[i]]++;
        }

        // Count the number of singular socks
        for (int i = 1; i <= 100; i++) {
            if (counts[i] % 2 != 0) {
                singularCount++;
            }
        }

        System.out.println("Count of singular socks: " + singularCount);
    }
}
