package com.covid.covidweb.controller;

//import java.util.Optional;

//import com.covid.covidweb.entities.Usuario;
import com.covid.covidweb.repository.EmpresaRepository;
import com.covid.covidweb.repository.RolRepository;
import com.covid.covidweb.repository.UsuarioRepository;
//import com.covid.covidweb.util.PasswordG;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    EmpresaRepository empresaRepository;

    @Autowired
    RolRepository rolRepository;

    @GetMapping({ "/login" })
    public String inicioUfps() {

        return "login";
    }

    /*@GetMapping({ "/montar" })
    public String montarString() {

        final Optional<Usuario> uOptional = usuarioRepository.findByUsuario("daniel");

        Usuario usuario = uOptional.get();

        System.out.println(usuario.getUsuario());

        PasswordG g = new PasswordG();

        usuario.setEmail("danielcaos@ufps.edu.co");
        usuario.setClave(g.encriptador("1234"));

        usuarioRepository.save(usuario);

        return "redirect:/login";

    }*/



}