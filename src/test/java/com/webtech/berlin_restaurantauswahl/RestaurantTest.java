package com.webtech.berlin_restaurantauswahl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RestaurantTest {

    @Test
    public void testRestaurantConstructorAndGetters() {
        Restaurant r = new Restaurant("Testname", "Teststraße", "10–20 Uhr", "Italienisch");

        assertEquals("Testname", r.getName());
        assertEquals("Teststraße", r.getAddress());
        assertEquals("10–20 Uhr", r.getBusinesshours());
        assertEquals("Italienisch", r.getCategory());
    }

    @Test
    public void testSetters() {
        Restaurant r = new Restaurant();
        r.setName("Asia Haus");
        r.setAddress("Berliner Allee");
        r.setBusinesshours("9–21 Uhr");
        r.setCategory("Asiatisch");

        assertEquals("Asia Haus", r.getName());
        assertEquals("Berliner Allee", r.getAddress());
        assertEquals("9–21 Uhr", r.getBusinesshours());
        assertEquals("Asiatisch", r.getCategory());
    }
}
