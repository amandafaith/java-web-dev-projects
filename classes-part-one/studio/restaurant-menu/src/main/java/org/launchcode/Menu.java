package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;
    private boolean isNew;

public Menu(ArrayList<MenuItem> menuItems,Date lastUpdated) {
    this.menuItems = menuItems;
    this.lastUpdated = lastUpdated;
}

public ArrayList<MenuItem> getMenuItems(){
    return menuItems;
}

public Date getLastUpdated(){
    return lastUpdated;
}

}
