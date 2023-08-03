import { Component, OnInit } from '@angular/core';
import { Administrador } from '../administrador';
import { Router } from '@angular/router';
import { AdministradorService } from '../administrador.service';

@Component({
  selector: 'app-registrar-admin',
  templateUrl: './registrar-admin.component.html',
  styleUrls: ['./registrar-admin.component.css']
})
export class RegistrarAdminComponent implements OnInit{
  
  administrador : Administrador = new Administrador();

  constructor(private administradorServicio:AdministradorService, private router:Router){}


  ngOnInit(): void {
  }

  guardarAdministrador(){
    this.administradorServicio.registrarAdministrador(this.administrador).subscribe(dato => {
      console.log(dato);
    }, error => console.log(error));
  }

  onSubmit(){
    this.guardarAdministrador();
  }
}
