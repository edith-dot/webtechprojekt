package com.webtech.berlin_restaurantauswahl;

import jakarta.persistence.*;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String businesshours;
    private String category;

    public Restaurant() {}

    public Restaurant(String name, String address, String businesshours, String category) {
        this.name = name;
        this.address = address;
        this.businesshours = businesshours;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getBusinesshours() {
        return businesshours;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBusinesshours(String businesshours) {
        this.businesshours = businesshours;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
