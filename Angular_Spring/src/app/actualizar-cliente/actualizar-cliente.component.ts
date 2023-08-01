import { Component, OnInit } from '@angular/core';
import { Cliente } from '../cliente';
import { ActivatedRoute, Router } from '@angular/router';
import { ClienteService } from '../cliente.service';

@Component({
  selector: 'app-actualizar-cliente',
  templateUrl: './actualizar-cliente.component.html',
  styleUrls: ['./actualizar-cliente.component.css']
})
export class ActualizarClienteComponent implements OnInit{
  id:number;
  cliente: any;
  
  constructor(private route:ActivatedRoute, private clienteServicio:ClienteService, private router:Router){}

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.cliente = new Cliente();
    this.clienteServicio.obtenerClienteId(this.id).subscribe(dato => {
      this.cliente = dato;
    })
  }

  actualizarCliente(){
    this.clienteServicio.actualizarCliente(this.id, this.cliente).subscribe(dato => {
      console.log(dato);
      this.irALaListaClientes();
    }, error => console.log(error));
  }

  irALaListaClientes(){
    this.router.navigate(['/clientes']);
  }

  onSubmit(){
    this.actualizarCliente();
  }
  
}
