package com.clientes.gestion_clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.clientes.gestion_clientes.modelo.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
