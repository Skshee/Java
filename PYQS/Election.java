import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize array to hold votes for candidates 1 to 5 (index 0 is unused)
        int[] votes = new int[6]; // Index 1-5 will hold the votes for each candidate
        int spoiltVotes = 0; // To count the number of spoilt ballots

        System.out.println("Enter the total number of voters:");
        int totalVoters = scanner.nextInt();

        // Read ballots and count the votes
        System.out.println("Enter the votes (candidate numbers between 1-5):");
        for (int i = 0; i < totalVoters; i++) {
            int vote = scanner.nextInt();

            // Check if the vote is valid (between 1 and 5)
            if (vote >= 1 && vote <= 5) {
                votes[vote]++; // Increment the vote count for the valid candidate
            } else {
                spoiltVotes++; // Increment spoilt votes count for invalid votes
            }
        }

        // Display the votes for each candidate
        System.out.println("\nVote count for each candidate:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Candidate " + i + ": " + votes[i] + " votes");
        }

        // Display the number of spoilt ballots
        System.out.println("Spoilt ballots: " + spoiltVotes);
    }
}
