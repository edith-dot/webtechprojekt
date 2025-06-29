package com.webtech.berlin_restaurantauswahl;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://webtechfrontend-gwf2.onrender.com")
@RestController
public class RestaurantController {

    private final RestaurantRepository restaurantRepository;

    public RestaurantController(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @GetMapping("/berliner-restaurantauswahl")
    public List<Restaurant> getRestaurants() {
        return restaurantRepository.findAll();
    }

    @PostMapping("/berliner-restaurantauswahl")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @GetMapping("/berliner-restaurantauswahl/search/{name}")
    public List<Restaurant> searchByName(@PathVariable String name) {
        return restaurantRepository.findByNameContainingIgnoreCase(name);
    }

    @GetMapping("/berliner-restaurantauswahl/category/{category}")
    public List<Restaurant> searchByCategory(@PathVariable String category) {
        return restaurantRepository.findByCategoryIgnoreCase(category);
    }

    @DeleteMapping("/berliner-restaurantauswahl/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        restaurantRepository.deleteById(id);
    }

}
