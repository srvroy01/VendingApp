package com.vending;

//Item class to store Items and stock processing
public class Item {

 String itemName;
 int stockLevel;
 String selectionID;
 double price;

 // method to set values of new instances
  public void setStock(String aName, int numberOf, String sID, double aPrice) {

     itemName = aName;
     stockLevel = numberOf;
     selectionID = sID;
     price = aPrice;

 }
 // Method to decrement stock level after successful process
  public void stockAdjust() {

     this.stockLevel--;

 }


}