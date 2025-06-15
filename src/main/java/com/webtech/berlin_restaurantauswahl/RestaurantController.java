package com.webtech.berlin_restaurantauswahl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Hier die verbindung erstellt zwischen backend und frontend
//Hier hat das CrossOrigin gefehlt
@CrossOrigin(origins = "https://webtechfrontend-gwf2.onrender.com")
@RestController
public class RestaurantController {

    @GetMapping("/berliner-restaurantauswahl")
    public List<Restaurant> getRestaurants() {
        return List.of(
                new Restaurant("Restaurant Beispiel", "Beispielstr. 187", "Mo-So, 10-20 Uhr", "Kebab")
        );
    }
}
