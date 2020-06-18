package com.covid.covidweb.controller;

import java.sql.Date;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import com.covid.covidweb.entities.Usuario;
import com.covid.covidweb.entities.Visitante;
import com.covid.covidweb.repository.UsuarioRepository;
import com.covid.covidweb.repository.VisitanteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping({ "/inicio/" })
public class IndexController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    VisitanteRepository visitanteRepository;
    
    @GetMapping({"/"})
    public String index(){

        return "index";
    }

    @GetMapping({"/infoBasic"})
    public String infoBasic() {
        return "infoBasic";
    }

    @PostMapping({"/infoBasic"})
    public String actualizaBasic(HttpServletRequest request){
        
        final Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
        final String username = loggedInUser.getName();

        final Optional<Usuario> p = usuarioRepository.findByUsuario(username);

        Visitante v = new Visitante();

        int ep = 1;
        if(request.getParameter("eps").equals("Tiene")){
            ep=0;
        }

        v.setDocumento(request.getParameter("documento"));
        v.setNombre(request.getParameter("nombre"));
        v.setFechanacimiento(Date.valueOf(request.getParameter("fecha")));
        v.setEps(ep);
        v.setGenero(request.getParameter("genero"));
        v.setEmpresaBean(p.get().getEmpresaBean());

        visitanteRepository.save(v);
        
        return "redirect:/inicio/";
    }
    

}