package com.cromixsoft.Dashboard.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "country")
public class Country {
    @Id
    @Column(name = "Code")
    private String code;
    @Column(name = "Name")
    private String Name;
    @Column(name = "Continent")
    private String Continent;

    public Country() {
    }
    public Country(String code, String name, String continent) {
        this.code = code;
        Name = name;
        Continent = continent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }
}