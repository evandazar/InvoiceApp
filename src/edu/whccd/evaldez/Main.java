package edu.whccd.evaldez;

import java.util.Scanner;

/*
    The purpose of this application is to replicate the code in Figure 2-17.
    author: Evander Valdez
*/
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println(); //prints out a blank line

        Scanner sc = new Scanner(System.in);

        //preform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            // get the invoice subtotal from the user
            System.out.print("Enter subtotal: ");
            double subtotal = sc.nextDouble();

            //calculate the discount amount and total
            double discountPercent = 0.0;
            if (subtotal >= 200)
                discountPercent = .2;
            else if (subtotal>= 100)
                discountPercent = .1;
            else
                discountPercent = 0.0;

            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;

            //display the discount amount and total
            String message = "Discount percent: " + discountPercent + "\n"
                            + "Discount amount: " + discountAmount + "\n"
                            + "Invoice total: " + total + "\n";
            System.out.println(message);

            //see is the use wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        }
    }

