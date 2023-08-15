// package com.clientes.gestion_clientes.modelo;

// import java.util.List;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.ManyToMany;
// import jakarta.persistence.Table;
// import lombok.Getter;
// import lombok.Setter;

// @Entity
// @Table(name = "servicios_empresa")
// public class Servicios {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
//     @Getter @Setter @Column(name = "nombre Servicio", length = 15, nullable = false)
//     private String serviciosEmpresa;

//     @Getter @Setter @Column(nullable = true)
//     @ManyToMany(mappedBy = "tipoCliente")
//     private List<Cliente> clientes;

//     public Servicios(Long id, String serviciosEmpresa, List<Cliente> clientes) {
//         this.id = id;
//         this.serviciosEmpresa = serviciosEmpresa;
//         this.clientes = clientes;
//     }

//     public Servicios() {
//     }
    
    
// }
