package com.cromixsoft.Dashboard.controllers;

import com.cromixsoft.Dashboard.models.City;
import com.cromixsoft.Dashboard.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping("/best")
    public String test() {
        return "dfsafs";
    }

    //
    @GetMapping("/allUsers")
    public List<City> allCities() {
        System.out.println(cityRepository.findById(712));
        return cityRepository.findAll();
    }

    @GetMapping("/add")
    public City addCity() {
        return cityRepository.save(new City("Zeu", 2333l));
    }


}
