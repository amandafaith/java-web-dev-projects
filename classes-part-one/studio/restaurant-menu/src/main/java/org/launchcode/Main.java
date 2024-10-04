package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MenuItem items = new MenuItem(20.20,"This is tasty");
        Menu listOfItems = new Menu("ChickenFry","5/10/25")

        ArrayList<String> categoryList = new ArrayList<>();

        // write your code here
        categoryList.add("chicken burger");
        categoryList.add("potato fries");

        items.getCategory();


    }
}








// menu consists of several menu items
// each menu item has a price, description, category (app, main, dessert)
// should be possible to display whether a menu item is new or not
// app should know when the menu was last updated
//
//Classes:
//
//public class Menu
//private ArrayList<MenuItem>
//private Date lastUpdated
//
//
//
//
//public class MenuItem
//private double price
//private String description
//private String category
//private boolean isNew