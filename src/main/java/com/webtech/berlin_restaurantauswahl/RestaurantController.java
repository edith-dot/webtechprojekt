package com.webtech.berlin_restaurantauswahl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class RestaurantController {

    @GetMapping("/berliner-restaurantauswahl")
    public List<Restaurant> getRestaurants() {
        return List.of(
                new Restaurant ("Restaurant Eins", "Beispielstr. 187", "Mo-So, 10-20 Uhr", "Kebab"),
                new Restaurant("Restaurant Zwei", "Beispielstr. 69", "Mo-So, 10-20 Uhr", "Italienisch")
        );
    }
}
