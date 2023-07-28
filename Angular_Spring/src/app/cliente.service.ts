import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from './cliente';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {
  //base url del listado de clientes en el backend;
  private baseURL = "http://localhost:8080/api/v1/clientes";
  
  constructor(private httpClient : HttpClient) {}

  //este metodo nos sirve para obtener los clientes;
  obtenerListaClientes():Observable<Cliente[]>{
    return this.httpClient.get<Cliente[]>(`${this.baseURL}`);
  }
  

  
}
