package com.plurasight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Ask the user to type in the game score
        System.out.print("Please enter a game score (Format: Team1:Team2|Score1:Score2): ");
        String scoreInput = input.nextLine().trim();

        // 2. Split the input into 2 parts using the "|" character
        String[] parts = scoreInput.split("\\|");

        // Make sure the input is valid
        if (parts.length != 2) {
            System.out.println("Invalid format. Please use Team1:Team2|Score1:Score2 format.");
        } else {
            // 3. Split the first part to get the team names
            String[] teams = parts[0].split(":");

            // 4. Split the second part to get the scores
            String[] scores = parts[1].split(":");

            // Make sure both splits are valid
            if (teams.length == 2 && scores.length == 2) {
                // Trim names and convert scores to numbers
                String team1 = teams[0].trim();
                String team2 = teams[1].trim();
                int score1 = Integer.parseInt(scores[0].trim());
                int score2 = Integer.parseInt(scores[1].trim());

                // 5. Compare scores and print the winner
                if (score1 > score2) {
                    System.out.println("Winner: " + team1);
                } else if (score2 > score1) {
                    System.out.println("Winner: " + team2);
                } else {
                    System.out.println("It's a tie!");
                }
            } else {
                System.out.println("Invalid input for team names or scores.");
            }
        }
    }
}