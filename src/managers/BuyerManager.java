/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Buyer;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class BuyerManager {

    private final Scanner scanner;
    
    public BuyerManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public Buyer addBuyer() {
        System.out.println("-----Add reader-----");
        Buyer buyer = new Buyer();
        System.out.println("Enter Firstname:");
        buyer.setFirstname(scanner.nextLine());
        System.out.println("Enter Lastname");
        buyer.setLastname(scanner.nextLine());
        System.out.println("Enter your balance");
        buyer.setBalance(scanner.nextDouble());
        System.out.println("Added reader: " + buyer.toString());
        return buyer;
    }

    public void printListBuyer(Buyer[] buyers) {
        System.out.println("----- Buyer list -----");
        for (int i = 0; i < buyers.length; i++) {
            System.out.println("Client: " + buyers[i].getFirstname() + " " + buyers[i].getLastname() + " Balance: " + buyers[i].getBalance() + " Euro");
        }
    }

    public void increaseBalance(Buyer[] buyers) {
        printListBuyer(buyers);
        System.out.print("Enter the buyer number from the list:");
        int buyerNumber = scanner.nextInt();scanner.nextLine();
        System.out.println("How much money do you want to add to the balance?");
        double amount = scanner.nextDouble();

        Buyer selectedBuyer = buyers[buyerNumber - 1];
        double currentBalance = selectedBuyer.getBalance();
        double newBalance = currentBalance + amount;
        selectedBuyer.setBalance(newBalance);

        System.out.println("Increased balance for " + selectedBuyer.getFirstname() + " " + selectedBuyer.getLastname() + " by " + amount + " Euro");
        System.out.println("Now the balance for " + selectedBuyer.getFirstname() + " " + selectedBuyer.getLastname() + " is " + selectedBuyer.getBalance() + " Euro");
    }
}
