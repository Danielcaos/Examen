package com.covid.covidweb.repository;

import com.covid.covidweb.entities.Tipo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoRepository extends JpaRepository<Tipo, Integer> {
    
}