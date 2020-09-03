package com.vending;
//TransactionProcess class to perform transaction and money operations

public class TransactionProcess {

 double itemPrice;
 double change;

 double Transaction(double moneyIn, double aPrice) {

     double change;
     change = moneyIn - aPrice; 
     return change;

 }

 // check for credits enetered by user to be sufficient
 boolean enoughCredit() {

     if (this.change > 0)
         return true; 
     else
         return false; 
 }

}