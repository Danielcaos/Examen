package com.covid.covidweb.repository;

import com.covid.covidweb.entities.Acceso;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccesoRepository extends JpaRepository<Acceso, Integer> {
    
}