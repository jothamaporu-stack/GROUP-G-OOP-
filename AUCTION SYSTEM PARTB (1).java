/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.auctionsystem;

import java.util.Scanner;

public class AuctionSystem {

    public static void main(String[] args) {
       
       


 

        Scanner input = new Scanner(System.in);

        // Vehicle details
        System.out.print("Enter vehicle registration number: ");
        String regNo = input.nextLine();

        System.out.print("Enter vehicle cost: ");
        double vehicleCost = input.nextDouble();

        System.out.print("Enter total deposits made: ");
        double deposits = input.nextDouble();

        System.out.print("Enter total expenses incurred: ");
        double expenses = input.nextDouble();

        // Balance calculation
        double balance = vehicleCost - deposits;

        System.out.println("\n--- Vehicle Details ---");
        System.out.println("Registration Number: " + regNo);
        System.out.println("Balance Left: " + balance);

        // Loop for bidders
        String highestBidder = "";
        double highestBid = 0;

        for (int i = 1; i <= 3; i++) {
            input.nextLine(); // clear buffer

            System.out.print("\nEnter bidder " + i + " name: ");
            String bidderName = input.nextLine();

            System.out.print("Enter bid amount: ");
            double bidAmount = input.nextDouble();

            if (bidAmount > highestBid) {
                highestBid = bidAmount;
                highestBidder = bidderName;
            }
        }

        // Display auction result
        System.out.println("\n--- Auction Result ---");
        System.out.println("Highest Bidder: " + highestBidder);
        System.out.println("Highest Bid Amount: " + highestBid);

        // Profit or Loss calculation
        double profitOrLoss = highestBid - (vehicleCost + expenses);

        System.out.println("\n--- Financial Summary ---");
        if (profitOrLoss > 0) {
            System.out.println("Profit Made: " + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("Loss Made: " + Math.abs(profitOrLoss));
        } else {
            System.out.println("No Profit, No Loss");
        }

        input.close();
    }
}
 
        
    

