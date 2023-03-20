import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = "Menu based app - Unit conversion for Distance\n\n" +
                "1. CM to M\n" +
                "2. M to KM\n" +
                "3. KM to M\n" +
                "4. M to CM\n\n" +
                "Enter your menu : ";

        boolean continueConversion = true;
        while (continueConversion) {
            System.out.print(menu);
            int option = scanner.nextInt();
            double value, result;
            String fromUnit, toUnit;

            switch (option) {
                case 1:
                    fromUnit = "CM";
                    toUnit = "M";
                    System.out.print("Please enter the CM Value: ");
                    value = scanner.nextDouble() / 100.0; // convert cm to m
                    break;

                case 2:
                    fromUnit = "M";
                    toUnit = "KM";
                    System.out.print("Please enter the M Value: ");
                    value = scanner.nextDouble() / 1000.0; // convert m to km
                    break;

                case 3:
                    fromUnit = "KM";
                    toUnit = "M";
                    System.out.print("Please enter the KM Value: ");
                    value = scanner.nextDouble() * 1000.0; // convert km to m
                    break;

                case 4:
                    fromUnit = "M";
                    toUnit = "CM";
                    System.out.print("Please enter the M Value: ");
                    value = scanner.nextDouble() * 100.0; // convert m to cm
                    break;

                default:
                    System.out.println("Invalid menu option. Please try again.");
                    continue;
            }

            result = (value * 100.0) / 100.0;
            System.out.println(result + " " + fromUnit + " = " + result + " " + toUnit);

            System.out.print("\nDo you want to Continue? (y/n): ");
            char choice = scanner.next().charAt(0);
            continueConversion = (choice == 'y' || choice == 'Y');
        }

        System.out.println("\nThank you for using the Distance Converter!");
    }
}
