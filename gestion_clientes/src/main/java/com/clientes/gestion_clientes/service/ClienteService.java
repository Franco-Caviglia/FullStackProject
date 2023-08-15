package com.clientes.gestion_clientes.service;

import org.springframework.stereotype.Service;

import com.clientes.gestion_clientes.modelo.Cliente;
import com.clientes.gestion_clientes.repository.ClienteRepository;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class ClienteService {
    
    private final ClienteRepository clienteRepository;
    
    public Cliente guardarCliente( Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
