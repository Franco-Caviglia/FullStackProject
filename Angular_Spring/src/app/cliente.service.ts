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
  
  //metodo para registrar un cliente en la lista;
  registrarCliente(cliente : Cliente) : Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, cliente); //Envio desde el backend y con el httpClient lo recibo;
  }

  actualizarCliente(id:number, cliente : Cliente) : Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id}`,cliente);
  }
  
  eliminarCliente(id:number) : Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }

  obtenerClienteId(id: number) : Observable<Object>{
    return this.httpClient.get(`${this.baseURL}/${id}`);
  }
}
