package com.cromixsoft.Dashboard.controllers;

import com.cromixsoft.Dashboard.models.Country;
import com.cromixsoft.Dashboard.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;

    @GetMapping("/allCountries")
    public List<Country> getAllCountries(){
        return  countryRepository.findAll();
    }
}
