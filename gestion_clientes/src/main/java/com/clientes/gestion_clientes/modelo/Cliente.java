package com.clientes.gestion_clientes.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clientes")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter @Setter @Column(name="N. Cuenta", length = 60, nullable = false, unique = true)
    private Long numCuenta;//Numero de cuenta que tiene el cliente, es UNICO. Utilizado para identificarlo;
    @Getter @Setter @Column(name="nombre", length = 60, nullable = false)
    private String nombre;//Nombre del cliente;
    @Getter @Setter @Column(name="apellido", length = 60, nullable = false)
    private String apellido;//Apellido del cliente;
    @Getter @Setter @Column(name="email", length = 60, nullable = false, unique = true)
    private String email;//Email del cliente para contacto;
    @Getter @Setter @Column(name="telefono", length = 60, nullable = false)
    private String telefono;//Telefono del cliente para contacto;
    @Getter @Setter @Column(name="dni", length = 60, nullable = false)
    private String dni;//DNI del cliente;
    @Getter @Setter @Column(name="tipoCliente", length = 10, nullable = false)
    private String tipoCliente;//Tipo de cliente, ya sea de Camaras de seguridad, Alarmas, Sist. contra incendios;
    @Getter @Setter @Column(name="Servicio", length = 10, nullable = false)
    private String servicioAbonado;//Servicio que contiene el abonado, ya sea: Personal, Movistar, Claro, etc;
    


    public Cliente(Long id, String nombre, String apellido, String email, String telefono, String dni, String tipoCliente, Long numCuenta, String servicioAbonado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
        this.tipoCliente = tipoCliente;
        this.numCuenta = numCuenta;
        this.servicioAbonado = servicioAbonado;
    }

    public Cliente() {
    }
    
    
}
