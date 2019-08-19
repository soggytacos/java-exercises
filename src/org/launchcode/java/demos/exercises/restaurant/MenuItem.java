package org.launchcode.java.demos.exercises.restaurant;

import java.util.Date;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class MenuItem {

    //initialize the fields that will hold data for all menu items.
    private String itemName;
    private double itemPrice;
    private String itemDescription;
    private String itemCategory;
    private Date dateAdded;

    //initialize the getters.
    public String getItemName() {return itemName;}
    public double getItemPrice() {return itemPrice;}
    public String getItemDescription() {return itemDescription;}
    public String getItemCategory() {return itemCategory;}
    public Date getDateAdded() {return dateAdded;}

    //initialize the setters.
    public void setItemName(String name) {itemName = name;}
    public void setItemPrice(double price) {itemPrice = price;}
    public void setItemDescription(String description) {itemDescription = description;}
    public void setItemCategory(String category) {itemCategory = category;}
    public void setDateAdded(Date date) {dateAdded = date;}

    //create the application that allows a user to add menu items.
    public MenuItem(String itemName, double itemPrice, String itemDescription, String itemCategory) {

        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;

    }

    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        System.out.println("Press 1 to add a new item to the menu or press 0 to view the current menu");
        int tempSelect = in.nextInt();
        if (tempSelect !=1 && tempSelect !=0){
            System.out.println("You must select 1 or 0.");
        } else if (tempSelect == 1) {
            System.out.println("Enter the name of the new menu item.");
            String tempName = in.nextLine();
            System.out.println("Enter the price of the new menu item.");
            double tempPrice = in.nextDouble();
            System.out.println("Enter the description of the new menu item.");
            String tempDesc = in.nextLine();
            System.out.println("Is this an appetizer, entre, or dessert?");
            String tempCat = in.nextLine();
            MenuItem tempMenuItem = new MenuItem(tempName, tempPrice, tempDesc, tempCat);
            System.out.println(tempName +", an item on the " + tempCat +" menu is $" + tempPrice +". " + tempDesc +".");
        } else if (tempSelect == 0) {
            System.out.println("this is a placeholder for the menu.");
        }



    }

}
