package org.launchcode;

import java.util.List;

public class MenuItem {
    private double price;
    private String description;
    private String category;


    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;



    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory(){
        return category;
    }
}
