package com.nojoum.al.malaeb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nojoum.al.malaeb.entities.Country;

public interface ICountry extends JpaRepository<Country, Long> {

}
