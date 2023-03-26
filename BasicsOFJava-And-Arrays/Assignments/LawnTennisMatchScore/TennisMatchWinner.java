import java.io.BufferedReader;
import java.io.FileReader;

public class TennisMatchWinner {
    public static void main(String[] args) {
        String line;
        String csvSplitBy = ",";
        int[] playerAScores = null;
        int[] playerBScores = null;

        try {
            FileReader file = new FileReader("TennisMatchScore.csv");
            BufferedReader br = new BufferedReader(file);
            // Read the scores for Player A
            line = br.readLine();
            String[] scoresA = line.split(csvSplitBy);
            playerAScores = new int[scoresA.length];
            for (int i = 0; i < scoresA.length; i++) {
                playerAScores[i] = Integer.parseInt(scoresA[i].trim());
            }

            // Read the scores for Player B
            line = br.readLine();
            String[] scoresB = line.split(csvSplitBy);
            playerBScores = new int[scoresB.length];
            for (int i = 0; i < scoresB.length; i++) {
                playerBScores[i] = Integer.parseInt(scoresB[i].trim());
            }
        } catch (Exception e) {
            System.out.println("An exception has occured." + e.getMessage());
        }

        // Calculate the total scores for each player
        int totalAScore = 0;
        int totalBScore = 0;
        for (int i = 0; i < playerAScores.length; i++) {
            totalAScore += playerAScores[i];
            totalBScore += playerBScores[i];
        }

        // Print the winner's name
        if (totalAScore > totalBScore) {
            System.out.println("Winner is: Player-A");
        } else {
            System.out.println("Winner is: Player-B");
        }
    }
}
