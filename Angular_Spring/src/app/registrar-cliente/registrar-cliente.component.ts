import { Component, OnInit } from '@angular/core';
import { Cliente } from '../cliente';

@Component({
  selector: 'app-registrar-cliente',
  templateUrl: './registrar-cliente.component.html',
  styleUrls: ['./registrar-cliente.component.css']
})
export class RegistrarClienteComponent implements OnInit{
  
  cliente : Cliente = new Cliente();
  constructor(){}

  ngOnInit(): void {
      console.log(this.cliente);
  }
}
