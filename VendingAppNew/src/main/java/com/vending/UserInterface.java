package com.vending;
//UserInterface class to allow user to interact with program

import java.util.Scanner;

public class UserInterface {

 double moneyIn;
 double moneyOut;
 boolean isAvailable;
 String selection;

 // method to accept amount from user
 public void getMoney() {

     Scanner sc = new Scanner(System.in);
     System.out.println("Please insert money: ");
     moneyIn = sc.nextDouble();
     System.out.println(" ");
     
 }

 // method to get input from user
 public void getInput() {

     Scanner scan = new Scanner(System.in);

     System.out.println("***** Bottles of drink *****");
     System.out.println("[B1] Coke, [B2] Dr Pepsi, [B3] Sprite\n");
     System.out.println("***** Chocolate Bars *****");
     System.out.println("[C1] Five Star, [C2] Dairy Milk, [C3] Munch\n");

     selection = scan.nextLine();
     selection = selection.toUpperCase();
     
 }

 public void displayChoice(String aChoice, double aPrice, double someChange) {

     // method to display vending machine's process
     
     System.out.println("You choice " + aChoice);
     System.out.println("This costs " + aPrice);
     System.out.println("You are due " + someChange + " change\n ");
     System.out.println("Vending Item \n" + "...\n" + "...\n" + "Please Take your " + aChoice + "\n");
     System.out.println("Vending Change \n" + "...\n" + "...\n" + "Please Take your " + someChange + " change\n");
     System.out.println("Thank you \n");

 }

 // method to display that the funds are not sufficient
public void insufficientFunds() {

     throw new UnsupportedOperationException();

 }

 void catchAnError() {
     try {
         this.insufficientFunds();

     } catch (UnsupportedOperationException e) {

         System.out.println("Sorry Insufficient Funds Please Try Again \n");
         System.out.println(
                 "Returning money \n" + "...\n" + "...\n" + "Please collect your " + this.moneyIn + " change\n");

     }

 }

}