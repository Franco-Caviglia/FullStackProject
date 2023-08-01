package com.clientes.gestion_clientes.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

//Entidad para la base de datos;
@Entity
@Table(name = "administradores")
public class Administrador {
    
    @Id
    @Column(name="IdAdmin")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name="nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name="apellido", length = 50, nullable = false)
    private String apellido;
    @Column(name="email", length = 50, nullable = false, unique = true)
    private String email;
    @Column(name="telefono", length = 50, nullable = false)
    private String telefono;
    @Column(name="dni", length = 50, nullable = false, unique = true)
    private String dni;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "administrador")
    private List<Cliente> clientes;


    public Administrador(Long id, String nombre, String apellido, String email, String telefono, String dni, List<Cliente>clientes) {
        Id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
        this.clientes = clientes;
        
    }


    public Long getId() {
        return Id;
    }


    public void setId(Long id) {
        Id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getDni() {
        return dni;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }


    public List<Cliente> getClientes() {
        return clientes;
    }


    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    


}
