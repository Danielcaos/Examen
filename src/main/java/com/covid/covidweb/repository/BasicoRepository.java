package com.covid.covidweb.repository;

import com.covid.covidweb.entities.Basico;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicoRepository extends JpaRepository<Basico, Integer> {
    
}