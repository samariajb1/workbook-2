package com.plurasight;

import java.util.Arrays;
import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your first name? ");
        String firstName = input.nextLine().trim();
        System.out.print("What is your middle name? ");
        String middleName = input.nextLine().trim();
        if (middleName.equalsIgnoreCase("")) {
        }
        System.out.print("What is your lastname?" );
        String lastName = input.nextLine().trim();
        System.out.print("Do you have a suffix in your name? (Yes or No)");
        String hasSuffix = input.nextLine();
        String suffixEnter = "";
        if (hasSuffix.equalsIgnoreCase("yes")) {
            System.out.print("Please enter your suffix (e.g.,Sr,Jr,III" );
            suffixEnter = input.nextLine();
        }

        String fullName = firstName + "," + lastName + "," + middleName + "," + suffixEnter;

            System.out.println("Your Whole Name Is: " + fullName);



    }
}
