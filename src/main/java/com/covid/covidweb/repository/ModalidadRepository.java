package com.covid.covidweb.repository;

import com.covid.covidweb.entities.Modalidad;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ModalidadRepository extends JpaRepository<Modalidad, Integer> {
    
}