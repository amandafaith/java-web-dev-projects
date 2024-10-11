package org.launchcode;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {


        MenuItem item1 = new MenuItem(9.99, "Caesar Salad", "Appetizer", true);
        MenuItem item2 = new MenuItem(15.99, "Grilled Chicken Sandwich", "Main Course", false);
        MenuItem item3 = new MenuItem(7.99, "Chocolate Lava Cake", "Dessert", true);
        MenuItem item4 = new MenuItem(17.99, "Birria Tacos", "Main Course", false);
        MenuItem item5 = new MenuItem(12.99, "Brussel Sprouts", "Appetizer", true);

        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(item1);
        menuItems.add(item2);
        menuItems.add(item3);
        menuItems.add(item4);

        Date todayDate = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());

        Menu menu = new Menu(todayDate, menuItems);

        menu.addMenuItem(item5);



        menu.removeMenuItem(item2);


        System.out.println("Menu:");
        for (MenuItem item : menu.getMenuItems()) {
            System.out.println("- " + item.getDescription() + " (" + item.getCategory() + ")");
            System.out.println(" Price: $" + item.getPrice());
            System.out.println(" New item: " + (item.getIsNew() ? "Yes" : "No"));
            System.out.println();
        }

        System.out.println("Last updated: " + menu.getLastUpdated());



    }
}
