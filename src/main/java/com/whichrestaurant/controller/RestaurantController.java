package com.whichrestaurant.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class RestaurantController {

    @RequestMapping(path = "/restaurants", method = GET)
    public List<String> restaurants() {
        return asList("Restaurante 1", "Restaurante 2", "Restaurante 3");
    }
}
