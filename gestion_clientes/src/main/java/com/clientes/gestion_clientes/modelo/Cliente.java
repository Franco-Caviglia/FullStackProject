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
    @Getter @Setter @Column(name="num_cuenta", length = 60, nullable = false, unique = true)
    private Long numCuenta;//Numero de cuenta que tiene el cliente, es UNICO. Utilizado para identificarlo;
    @Getter @Setter @Column(nullable = false)
    private String nombre_titular;//Nombre del cliente titular de la cuenta;
    @Getter @Setter @Column(name="apellido", length = 60, nullable = false)
    private String apellido_titular;//Apellido del cliente titular de la cuenta;
    @Getter @Setter @Column(length = 60, nullable = false)
    private String email;//Email del cliente para contacto;
    @Getter @Setter @Column(length = 60, nullable = false)
    private String telefono;//Telefono del cliente para contacto;
    @Getter @Setter @Column(length = 60, nullable = false)
    private String dni;//DNI del cliente;

    // @ManyToMany
    // @Getter @Setter 
    // @JoinTable(name = "servicios_empresa",
    //             joinColumns = @JoinColumn(name = "cliente_servicio"),
    //             inverseJoinColumns = @JoinColumn(name = "servicio_id"))
    // private List<Servicios> tipoCliente;//Tipo de cliente, ya sea de Camaras de seguridad, Alarmas, Sist. contra incendios;

    @Getter @Setter @Column(name="servicio_contratado", length = 10, nullable = false)
    private String empresa;//Servicio que contiene el abonado, ya sea: Personal, Movistar, Claro, etc;
    //Nuevas vars;
    @Getter @Setter @Column(length = 15, nullable = false)
    private String estado;
    @Getter @Setter @Column(name = "tipo_pago", length = 20, nullable = true)
    private String tipoPago;
    @Getter @Setter @Column(name = "num_tarjeta", length = 20, nullable = true)
    private String numTarjeta;
    @Getter @Setter @Column(name = "Domicilio", length = 25, nullable = false)
    private String domicilio;
    @Getter @Setter @Column(name = "Localidad", length = 25, nullable = false)
    private String localidad;
    @Getter @Setter @Column(name = "Provincia", length = 25, nullable = false)
    private String provincia;
    @Getter @Setter @Column(name = "tipo_cuenta", length = 25, nullable = false)
    private String tipoCuenta;//Define si es un comercio, o una residencia;
    @Getter @Setter @Column(name = "Comunicador", length = 20, nullable = true)
    private String comunicador;//Modelo del comunicador en la alarma;
    @Getter @Setter @Column(name = "Comodato", length = 15, nullable = true)
    private String comodato;//Valores "Si", "No", "Ok";
    @Getter @Setter @Column(name = "click_app", length = 5, nullable = true)
    private String clickApp;//Si contiene o no la app de Click;
    @Getter @Setter @Column(name = "NTLINK_serie", length = 25, nullable = true)
    private String ntLinkSerie;//Numero de serie ntlink;
    @Getter @Setter @Column(name = "linea_alarma", length = 20, nullable = false)
    private String lineaAlarma;//Numero telefono u opcion "fijo";
    @Getter @Setter @Column(name = "codigo_instalador", length = 20, nullable = true)
    private String codInstalador;//Codigo de instalacioon;
    @Getter @Setter @Column(name = "Tipo Alarma", length = 20, nullable = false)
    private String tipoAlarma;//Modelo de Alarma;
    //------------ No definido en la tabla -----------
    // @Getter @Setter @Column(name="Comprobante", length = 15, nullable = false)
    // private String comprobante; 
    //------------------------------------------------

    //------------ No definido en la tabla -----------
    // @Getter @Setter @Column(name = "Cuenta 3ros", length = 25, nullable = true)
    // private String cuentaTerceros;
    //------------------------------------------------
    @Getter @Setter @Column(name = "Periodo", length = 15, nullable = false)
    private String peridodo;//Periodo de cobranza;
    @Getter @Setter @Column(name = "Fecha Alta", length = 15, nullable = false)
    private String fechaAlta;//Fecha en la que comenzo a tener servicio;
    @Getter @Setter @Column(name = "Fecha Baja", length = 15, nullable = true)
    private String fechaBaja;//Fecha que se retiro;
    @Getter @Setter @Column(name = "Cobrador", length = 15, nullable = false)
    private String cobrador;//Nombre del cobrador/a que va a recibir el cliente;
    @Getter @Setter @Column(name = "Abonado", length = 15, nullable = false)
    private String abonado;//Nombre del local, comercio o nombre completo del titular;

    public Cliente(Long id, Long numCuenta, String nombre, String apellido, String email, String telefono, String dni,
            String empresa, String estado, String tipoPago, String numTarjeta,
            String domicilio, String localidad, String provincia, String tipoCuenta, String comunicador,
            String comodato, String clickApp, String ntLinkSerie, String lineaAlarma, String codInstalador,
            String tipoAlarma, String peridodo, String fechaAlta,
            String fechaBaja, String cobrador, String abonado) {
        this.id = id;
        this.numCuenta = numCuenta;
        this.nombre_titular = nombre;
        this.apellido_titular = apellido;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
        this.empresa = empresa;
        this.estado = estado;
        this.tipoPago = tipoPago;
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
        this.peridodo = peridodo;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.cobrador = cobrador;
        this.abonado = abonado;
    }


    public Cliente() {
    }
    
    
}
