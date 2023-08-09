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
    @Getter @Setter @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String empresa;//Servicio que contiene el abonado, ya sea: Personal, Movistar, Claro, etc;
    //Nuevas vars;
    @Getter @Setter @Column(name = "Cuenta", length = 25, nullable = false)
    private String cuenta;
    @Getter @Setter @Column(name = "Estado", length = 15, nullable = false)
    private String estado;
    @Getter @Setter @Column(name = "Tipo de pago", length = 20, nullable = true)
    private String tipo;
    @Getter @Setter @Column(name = "N. Tarjeta", length = 20, nullable = true)
    private String numTarjeta;
    @Getter @Setter @Column(name = "Domicilio", length = 25, nullable = false)
    private String domicilio;
    @Getter @Setter @Column(name = "Localidad", length = 25, nullable = false)
    private String localidad;
    @Getter @Setter @Column(name = "Provincia", length = 25, nullable = false)
    private String provincia;
    @Getter @Setter @Column(name = "Tipo Cuenta", length = 25, nullable = false)
    private String tipoCuenta;
    @Getter @Setter @Column(name = "Comunicador", length = 20, nullable = false)
    private String comunicador;
    @Getter @Setter @Column(name = "Comodato", length = 15, nullable = true)
    private String comodato;
    @Getter @Setter @Column(name = "Click App", length = 5, nullable = true)
    private String clickApp;
    @Getter @Setter @Column(name = "NTLINK Serie", length = 25, nullable = true)
    private String ntLinkSerie;
    @Getter @Setter @Column(name = "Linea Alarma", length = 20, nullable = false)
    private String lineaAlarma;
    @Getter @Setter @Column(name = "Codigo Instalador", length = 20, nullable = true)
    private String codInstalador;
    @Getter @Setter @Column(name = "Tipo Alarma", length = 20, nullable = false)
    private String tipoAlarma;
    @Getter @Setter @Column(name="Comprobante", length = 15, nullable = false)
    private String comprobante;
    @Getter @Setter @Column(name = "Cuenta 3ros", length = 25, nullable = true)
    private String cuentaTerceros;
    @Getter @Setter @Column(name = "Periodo", length = 15, nullable = false)
    private String peridodo;
    @Getter @Setter @Column(name = "Din", length = 5, nullable = false)
    private String din;
    @Getter @Setter @Column(name = "Fecha Alta", length = 15, nullable = false)
    private String fechaAlta;
    @Getter @Setter @Column(name = "Fecha Baja", length = 15, nullable = true)
    private String fechaBaja;
    @Getter @Setter @Column(name = "Cobrador", length = 15, nullable = false)
    private String cobrador;
    @Getter @Setter @Column(name = "Abonado", length = 15, nullable = false)
    private String abonado;
    
    



    public Cliente(Long id, Long numCuenta, String nombre, String apellido, String email, String telefono, String dni,
            String tipoCliente, String empresa, String cuenta, String estado, String tipo, String numTarjeta,
            String domicilio, String localidad, String provincia, String tipoCuenta, String comunicador,
            String comodato, String clickApp, String ntLinkSerie, String lineaAlarma, String codInstalador,
            String tipoAlarma, String comprobante, String cuentaTerceros, String peridodo, String din, String fechaAlta,
            String fechaBaja, String cobrador, String abonado) {
        this.id = id;
        this.numCuenta = numCuenta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
        this.tipoCliente = tipoCliente;
        this.empresa = empresa;
        this.cuenta = cuenta;
        this.estado = estado;
        this.tipo = tipo;
        this.numTarjeta = numTarjeta;
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.provincia = provincia;
        this.tipoCuenta = tipoCuenta;
        this.comunicador = comunicador;
        this.comodato = comodato;
        this.clickApp = clickApp;
        this.ntLinkSerie = ntLinkSerie;
        this.lineaAlarma = lineaAlarma;
        this.codInstalador = codInstalador;
        this.tipoAlarma = tipoAlarma;
        this.comprobante = comprobante;
        this.cuentaTerceros = cuentaTerceros;
        this.peridodo = peridodo;
        this.din = din;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.cobrador = cobrador;
        this.abonado = abonado;
    }






    public Cliente() {
    }
    
    
}
