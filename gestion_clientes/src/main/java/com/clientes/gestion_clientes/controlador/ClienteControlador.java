package com.clientes.gestion_clientes.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clientes.gestion_clientes.modelo.Cliente;
import com.clientes.gestion_clientes.repository.ClienteRepository;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteControlador {
    
    @Autowired
    private ClienteRepository repository;

    //este metodo es para listar todos los clientes;
    @GetMapping("/clientes")
    public List<Cliente> listarTodosLosClientes(){ 
        return repository.findAll();
    }

    //este metodo es para guardar el empleado;
    @PostMapping("/clientes")
    public Cliente guardarCliente(@RequestBody Cliente cliente){
        return repository.save(cliente);
    }
}
