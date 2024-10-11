package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() { return description; }

    public String getCategory() { return category; }
;
    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return description + " with price: " + price;
    }

    public boolean equals(Object objectToCompare) {
        if (this == objectToCompare) {
            return true;
        }
        if(objectToCompare == null){
            return false;
        }
        if (getClass() != objectToCompare.getClass()) {
            return false;
        }
        MenuItem theMenuItem = (MenuItem) objectToCompare;
        boolean isPriceEqual =  theMenuItem.getPrice() == this.getPrice();
        boolean isDescriptionEqual =  theMenuItem.getDescription().equals(this.getDescription());
        boolean isCategoryEqual =  theMenuItem.getCategory().equals(this.getCategory());
        return isPriceEqual && isCategoryEqual && isDescriptionEqual;
    }
}

