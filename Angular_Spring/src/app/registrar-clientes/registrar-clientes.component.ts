import { Component, OnInit } from '@angular/core';
import { Cliente } from '../cliente';
import { ClienteService } from '../cliente.service';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';


@Component({
  selector: 'app-registrar-clientes',
  templateUrl: './registrar-clientes.component.html',
  styleUrls: ['./registrar-clientes.component.css']
})

export class RegistrarClientesComponent implements OnInit{
  
  cliente : Cliente = new Cliente();

  constructor(private clienteService:ClienteService, private router:Router){}
  
  ngOnInit(): void {
  }

  guardarCliente(){
    this.clienteService.registrarCliente(this.cliente).subscribe(dato => {
      console.log(dato);
      Swal.fire(
        'Cliente registrado',
        'Su cliente con numero de cuenta ' + this.cliente.numCuenta + 
        ' ha sido registrado',
        'success'
      )
      this.irALaListaClientes();
      
    }, error => console.log(error));
  }

  irALaListaClientes(){
    this.router.navigate(['/clientes']);
  }

  onSubmit(){
    this.guardarCliente();
  }
}
