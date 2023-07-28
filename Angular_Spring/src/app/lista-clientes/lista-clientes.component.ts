import { Component, OnInit } from '@angular/core';
import { Cliente } from '../cliente';
import { ClienteService } from '../cliente.service';

@Component({
  selector: 'app-lista-clientes',
  templateUrl: './lista-clientes.component.html',
  styleUrls: ['./lista-clientes.component.css']
})
export class ListaClientesComponent implements OnInit{

  clientes:Cliente[];

  constructor(private clienteServicio:ClienteService){}

  ngOnInit(): void {
    this.obtenerClientes();
  }

  //Con este metodo nos suscribimos a ese listado, lo obtenemos y lo inicializamos en el OnInIt;
  private obtenerClientes(){
    this.clienteServicio.obtenerListaClientes().subscribe(dato => {
      this.clientes = dato;
    })
  }
}
