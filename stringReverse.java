public class stringReverse {
    public static void main(String[] args) {
        String name = "RAYITH";
        String result = "";
        char arr[] = name.toCharArray();
        System.out.println(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            result += arr[i];
        }
        System.out.println("value of result " + result);
    }
}
