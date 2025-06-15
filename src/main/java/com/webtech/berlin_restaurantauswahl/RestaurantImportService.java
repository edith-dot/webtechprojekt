package com.webtech.berlin_restaurantauswahl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantImportService {

    private List<Restaurant> importedRestaurants = new ArrayList<>();

    public void importRestaurants() {
        try {
            String apiKey = "e2f9d1cb44db45b49b127d7bfbed0334";
            String url = "https://api.geoapify.com/v2/places?categories=catering.restaurant&filter=circle:13.4050,52.5200,5000&limit=10&apiKey=" + apiKey;

            RestTemplate restTemplate = new RestTemplate();
            String response = restTemplate.getForObject(url, String.class);

            ObjectMapper mapper = new ObjectMapper();
            JsonNode features = mapper.readTree(response).get("features");

            for (JsonNode feature : features) {
                JsonNode prop = feature.get("properties");

                Restaurant restaurant = new Restaurant(
                        prop.path("name").asText(""),
                        prop.path("address_line1").asText(""),
                        prop.path("opening_hours").asText(""),
                        prop.path("categories").isArray() ? prop.path("categories").get(0).asText("") : ""
                );

                importedRestaurants.add(restaurant);

                // Zum Debuggen ausgeben:
                System.out.println("Importiert: " + restaurant.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}