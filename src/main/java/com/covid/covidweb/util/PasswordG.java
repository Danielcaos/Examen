package com.covid.covidweb.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordG {
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(4);


    public String encriptador(String password) {

        return encoder.encode(password);
        
    }
}