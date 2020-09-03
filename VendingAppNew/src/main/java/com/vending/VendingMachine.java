package com.vending;
import java.util.Scanner; 

public class VendingMachine {

		  public static void main(String[] args) {

	        // initialize class for transactions
	        TransactionProcess transaction = new TransactionProcess();
	        
	     // drink items
	        Item bottleOne = new Item();
	        bottleOne.setStock("Coke", 10, "B1", 20);

	        Item bottleTwo = new Item();
	        bottleTwo.setStock("Pepsi", 10, "B2", 25);

	        Item bottleThree = new Item();
	        bottleThree.setStock("Sprite", 10, "B3", 28);

	        // chocolate itms 
	        Item chocOne = new Item();
	        chocOne.setStock("Five Star", 10, "C1", 10);

	        Item chocTwo = new Item();
	        chocTwo.setStock("Dairy Milk", 10, "C2", 10);

	        Item chocThree = new Item();
	        chocThree.setStock("Munch", 10, "C3", 5);
	        
	     // interface class for user interaction
	        UserInterface mainInterface = new UserInterface();
	        mainInterface.getMoney();
	        System.out.println("Available credit: " + mainInterface.moneyIn + "\n");
	        mainInterface.getInput();
	        System.out.println("\nYou entered " + mainInterface.selection);


	        // menu creation
	        switch (mainInterface.selection) {
	        case "B1":

	            transaction.itemPrice = bottleOne.price;
	            transaction.change = transaction.Transaction(mainInterface.moneyIn, transaction.itemPrice);

	            if (transaction.enoughCredit() == true) {
	                mainInterface.displayChoice(bottleOne.itemName, bottleOne.price, transaction.change);
	                bottleOne.stockAdjust();
	                break;
	            } else {

	                mainInterface.catchAnError();
	                break;
	            }

	        case "B2":

	            transaction.itemPrice = bottleTwo.price;
	            
	            // set itemPrice
	            transaction.change = transaction.Transaction(mainInterface.moneyIn, transaction.itemPrice);
	            
	            if (transaction.enoughCredit() == true) {
	            
	                // check for enough fund 
	                mainInterface.displayChoice(bottleTwo.itemName, bottleTwo.price, transaction.change);
	                
	                bottleTwo.stockAdjust();
	                
	                break;
	                

	            } else {

	                mainInterface.catchAnError();
	                break;
	                
	            }

	        case "B3":

	            transaction.itemPrice = bottleThree.price;
	            transaction.change = transaction.Transaction(mainInterface.moneyIn, transaction.itemPrice);

	            if (transaction.enoughCredit() == true) {
	                mainInterface.displayChoice(bottleThree.itemName, bottleThree.price, transaction.change);
	                bottleThree.stockAdjust();
	                break;
	            } else {

	                mainInterface.catchAnError();
	                break;
	            }

	        case "C1":

	            transaction.itemPrice = chocOne.price;
	            transaction.change = transaction.Transaction(mainInterface.moneyIn, transaction.itemPrice);

	            if (transaction.enoughCredit() == true) {
	                mainInterface.displayChoice(chocOne.itemName, chocOne.price, transaction.change);
	                chocOne.stockAdjust();
	                break;
	            } else {

	                mainInterface.catchAnError();
	                break;
	            }

	        case "C2":

	            transaction.itemPrice = chocTwo.price;
	            transaction.change = transaction.Transaction(mainInterface.moneyIn, transaction.itemPrice);

	            if (transaction.enoughCredit() == true) {
	                mainInterface.displayChoice(chocTwo.itemName, chocTwo.price, transaction.change);
	                chocTwo.stockAdjust();
	                break;
	            } else {

	                mainInterface.catchAnError();
	                break;
	            }

	        case "C3":

	            transaction.itemPrice = chocThree.price;
	            transaction.change = transaction.Transaction(mainInterface.moneyIn, transaction.itemPrice);

	            if (transaction.enoughCredit() == true) {
	                mainInterface.displayChoice(chocThree.itemName, chocThree.price, transaction.change);
	                chocThree.stockAdjust();
	                break;
	            } else {

	                mainInterface.catchAnError();
	                break;
	            }

	        default:

	            System.out.println("You made an invalid selection, please try again \n");
	            System.out.println("Returning money \n" + "...\n" + "...\n" + "Please collect your " + mainInterface.moneyIn
	                    + " change\n");
	            break;

	        }

	        // code to avoid screen from closing
	        int doNotClose;
	        Scanner stayOpen = new Scanner(System.in); 
	        doNotClose = stayOpen.nextInt();

	   
	        }
}
