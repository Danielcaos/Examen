package com.covid.covidweb.repository;

import com.covid.covidweb.entities.Visitante;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitanteRepository extends JpaRepository<Visitante, Integer> {
    
}