import { Component, OnInit } from '@angular/core';
import { Cliente } from '../cliente';
import { ActivatedRoute } from '@angular/router';
import { ClienteService } from '../cliente.service';

@Component({
  selector: 'app-cliente-detalles',
  templateUrl: './cliente-detalles.component.html',
  styleUrls: ['./cliente-detalles.component.css']
})
export class ClienteDetallesComponent implements OnInit {
  id:number;
  cliente: any;

  constructor(private route:ActivatedRoute, private clienteServicio:ClienteService){}


  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.cliente = new Cliente();
    this.clienteServicio.obtenerClienteId(this.id).subscribe(dato => {
      this.cliente = dato;
    })
  }
}
