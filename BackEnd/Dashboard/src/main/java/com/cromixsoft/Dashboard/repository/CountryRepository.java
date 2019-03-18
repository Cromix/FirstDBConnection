package com.cromixsoft.Dashboard.repository;

import com.cromixsoft.Dashboard.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,String> {
}
