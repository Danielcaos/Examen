package com.covid.covidweb.repository;

import com.covid.covidweb.entities.Ep;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EpRepository extends JpaRepository<Ep, Integer> {
    
}