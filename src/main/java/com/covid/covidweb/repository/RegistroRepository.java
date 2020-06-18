package com.covid.covidweb.repository;

import com.covid.covidweb.entities.Registro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroRepository extends JpaRepository<Registro, Integer> {
    
}