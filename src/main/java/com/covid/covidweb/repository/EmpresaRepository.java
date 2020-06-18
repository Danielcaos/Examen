package com.covid.covidweb.repository;

import com.covid.covidweb.entities.Empresa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
    
}