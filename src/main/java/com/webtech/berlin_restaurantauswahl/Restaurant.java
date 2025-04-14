package com.webtech.berlin_restaurantauswahl;

public class Restaurant {

    private String name;
    private String address;
    private String businesshours;
    private String category;

    public Restaurant(String name, String address, String businesshours, String category) {
        this.name = name;
        this.address = address;
        this.businesshours = businesshours;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBusinesshours() {
        return businesshours;
    }

    public void setBusinesshours(String businesshours) {
        this.businesshours = businesshours;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
