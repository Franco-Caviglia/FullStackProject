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
    
    this.clienteServicio.eliminarCliente(id).subscribe(dato => {
      console.log(dato);
      Swal.fire(
        'Cliente eliminado',
        'Su cliente con numero de cuenta ' + this.clientes[this.cliente.numCuenta] +' ha sido eliminado',
        'success'
      )
      
      this.obtenerClientes();
    })
    
  }

  actualizarCliente(id: number) {
    this.router.navigate(['actualizar-cliente', id]);
  }

  verDetallesCliente(id:number){
    this.router.navigate(['cliente-detalles', id]);
  }
}
