package org.launchcode.java.demos.exercises.restaurant;

import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class MenuItem {

    //initialize the fields that will hold data for all menu items.
    private String itemName;
    private double itemPrice;
    private String itemDescription;
    private String itemCategory;
    private Date dateUpdated;

    //initialize the getters.
    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    //initialize the setters.
    public void setItemName(String name) {
        itemName = name;
    }

    public void setItemPrice(double price) {
        itemPrice = price;
    }

    public void setItemDescription(String description) {
        itemDescription = description;
    }

    public void setItemCategory(String category) {
        itemCategory = category;
    }

    public void setDateUpdated() {
        dateUpdated = new Date();
    }

    //create the application that allows a user to add menu items.
    public MenuItem(String itemName, double itemPrice, String itemDescription, String itemCategory, Date dateUpdated) {

        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.dateUpdated = new Date();

    }

    public static void main(String[] agrs) {

        ArrayList<MenuItem> MenuItems = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        String userPrompt = "Enter 0 to view the current menu. \nEnter 1 to add a new item. \nEnter 2 to remove an item. \nEnter 9 to quit.";
        System.out.println(userPrompt);
        int tempSelect = in.nextInt();

        while (tempSelect != 9) {
            if (tempSelect != 1 && tempSelect != 0 && tempSelect != 2) {
                System.out.println("You must select 1, 0, 2, or 9.");
                tempSelect = in.nextInt();
            } else if (tempSelect == 2) {

            } else if (tempSelect == 1) {
                System.out.println("Enter the name of the new menu item.");
                in.nextLine();
                String tempName = in.nextLine();
                System.out.println("Enter the price of the new menu item.");
                double tempPrice = in.nextDouble();
                System.out.println("Enter the description of the new menu item.");
                in.nextLine();
                String tempDesc = in.nextLine();
                System.out.println("Is this an appetizer, entre, or dessert?");
                String tempCat = in.nextLine();
                Date tempDate = new Date();
                MenuItem tempMenuItem = new MenuItem(tempName, tempPrice, tempDesc, tempCat, tempDate);
                MenuItems.add(tempMenuItem);
                System.out.println(tempName + " is an $" + tempPrice + " item on our " + tempCat + " menu. " + tempDesc);
                System.out.println(userPrompt);
                tempSelect = in.nextInt();
            } else if (tempSelect == 0) {
                if (MenuItems.size() == 0) {
                    System.out.println("There are no items on the menu.");
                    System.out.println(userPrompt);
                    tempSelect = in.nextInt();
                } else {
                    for (MenuItem itemOnMenu : MenuItems) {
                        System.out.println(itemOnMenu.getItemName() + " is an $" + itemOnMenu.getItemPrice() + " item on our " + itemOnMenu.getItemCategory() + " menu. " + itemOnMenu.getItemDescription() + " This item was last updated on " + itemOnMenu.getDateUpdated() + ".");
                    }
                    System.out.println(userPrompt);
                    tempSelect = in.nextInt();
                }
            }
        }
    }
}
