package com.clientes.gestion_clientes.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clientes.gestion_clientes.modelo.Administrador;
import com.clientes.gestion_clientes.repository.AdministradorRepository;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class AdministradorControlador {
    @Autowired
    private AdministradorRepository repository;


    @GetMapping("/administradores")
    public List<Administrador> listaAdministradores(){
        return repository.findAll();
    }


}
