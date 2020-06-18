package com.covid.covidweb.repository;

import com.covid.covidweb.entities.Accesovisitante;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccesovisitanteRepository extends JpaRepository<Accesovisitante, Integer> {
    
}