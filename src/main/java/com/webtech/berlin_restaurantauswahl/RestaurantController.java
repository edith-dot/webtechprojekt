package com.webtech.berlin_restaurantauswahl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/berliner-restaurantauswahl")
    public List<Restaurant> getRestaurants() {
        return List.of(
                new Restaurant("Restaurant Beispiel", "Beispielstr. 187", "Mo-So, 10-20 Uhr", "Kebab")
        );
    }
}
