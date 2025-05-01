package com.webtech.berlin_restaurantauswahl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")  // 👈 Das erlaubt Zugriff vom Frontend
public class RestaurantController {

    @GetMapping("/berliner-restaurantauswahl")
    public List<Restaurant> getRestaurants() {
        return List.of(
                new Restaurant("Restaurant Beispiel", "Beispielstr. 187", "Mo-So, 10-20 Uhr", "Kebab")
        );
    }
}

