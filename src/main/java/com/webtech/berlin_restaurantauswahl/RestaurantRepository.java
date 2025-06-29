package com.webtech.berlin_restaurantauswahl;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    List<Restaurant> findByNameContainingIgnoreCase(String name);
    List<Restaurant> findByCategoryIgnoreCase(String category);
}

