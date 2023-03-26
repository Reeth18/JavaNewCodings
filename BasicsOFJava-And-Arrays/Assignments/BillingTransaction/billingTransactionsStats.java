import java.io.BufferedReader;
import java.io.FileReader;

public class billingTransactionsStats {
    public static void main(String[] args) {
        String line;
        String csvSplitBy = ",";
        int numTransactions = 1;// Already Starting with the First Bill
        double totalAmount = 0;
        double maxAmount = Double.MIN_VALUE;
        double minAmount = Double.MAX_VALUE;

        try {
            FileReader fp = new FileReader("Transaction.csv");
            BufferedReader br = new BufferedReader(fp);
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] transaction = line.split(csvSplitBy);
                int transactionId = Integer.parseInt(transaction[0]);
                String date = transaction[1];
                int customerId = Integer.parseInt(transaction[2]);
                double billAmount = Double.parseDouble(transaction[3]);

                numTransactions++;
                totalAmount += billAmount;
                if (billAmount > maxAmount) {
                    maxAmount = billAmount;
                }
                if (billAmount < minAmount) {
                    minAmount = billAmount;
                }

            }

            br.close();
        } catch (Exception e) {
            System.out.println("An Error has occured." + e.getMessage());
        }

        System.out.println("Total number of Transactions (bills) - " + numTransactions);
        System.out.println("Total Bill amount – " + totalAmount);
        System.out.println("Maximum Bill amount – " + maxAmount);
        System.out.println("Minimum Bill amount – " + minAmount);
    }
}
