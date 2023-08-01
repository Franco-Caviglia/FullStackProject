package com.clientes.gestion_clientes.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.clientes.gestion_clientes.modelo.Administrador;

public interface AdministradorRepository extends JpaRepository<Administrador, Long>{
    
}
