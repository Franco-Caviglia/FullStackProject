import { Component, OnInit } from '@angular/core';
import { Cliente } from '../cliente';
import { ClienteService } from '../cliente.service';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-lista-clientes',
  templateUrl: './lista-clientes.component.html',
  styleUrls: ['./lista-clientes.component.css']
})
export class ListaClientesComponent implements OnInit{
  

  clientes:Cliente[];

  cliente : Cliente = new Cliente();

  constructor(private clienteServicio:ClienteService, private router:Router){}

  ngOnInit(): void {
    this.obtenerClientes();
  }

  //Con este metodo nos suscribimos a ese listado, lo obtenemos y lo inicializamos en el OnInIt;
  private obtenerClientes(){
    this.clienteServicio.obtenerListaClientes().subscribe(dato => {
      
      this.clientes = dato;
    })
  }

  eliminarCliente(id: number) {
      Swal.fire({
        title: '¿Estas seguro?',
        confirmButtonText: 'Eliminar',
        cancelButtonText: 'Cancelar',
        showCancelButton: true
      }).then((result) => {
        if (result.isConfirmed){
          this.clienteServicio.eliminarCliente(id).subscribe(dato => {
            console.log(dato); 
            this.obtenerClientes();
          })
          
          Swal.fire({
            position: 'center',
            icon: 'success',
            title: 'El cliente ha sido eliminado',
            showConfirmButton: false,
            timer: 1500
          });
        } else {
          Swal.fire({
            position: 'center',
            icon: 'warning',
            title: 'Cancelado',
            showConfirmButton: false,
            timer: 1500
          });
        }
      });
  }


  verDetallesCliente(id:number){
    this.router.navigate(['info-clientes', id]);
  }
}



