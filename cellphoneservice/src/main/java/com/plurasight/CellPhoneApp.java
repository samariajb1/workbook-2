package com.plurasight;

import java.util.Arrays;
import java.util.Scanner;

public class CellPhoneApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        System.out.print("What is the Serial Number? ");
        int serial = Integer.parseInt(input.nextLine());
        phone.setSerialNumber(serial);

        System.out.print("What model is the phone?");
        String model = input.nextLine();
        phone.setModel(model);

        System.out.print("Who is your carrier? ");
        String carrier = input.nextLine();
        phone.setCarrier(carrier);

        System.out.print("What is the Phone Number? ");
        String phoneNumber = input.nextLine();
        phone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner? ");
        String owner = input.nextLine();
        phone.setOwner(owner);

        System.out.println("\nPhone Details:");
        System.out.println("Serial Number : " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
