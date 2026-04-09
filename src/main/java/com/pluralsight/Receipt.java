package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {

        String itemName = "Eggs";
        double itemPrice = 4.99;
        int itemQuantity = 12;

        System.out.println("You bought " + itemQuantity + " " + itemName + " for $" + itemPrice);
    }
}
