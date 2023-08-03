import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Administrador } from "./administrador";
import { Observable } from "rxjs";

@Injectable({
    providedIn: 'root'
})

export class AdministradorService{
    
    private baseURL = "http://localhost:8080/api/lista-clientes";

    constructor(private httpClient:HttpClient){}

    registrarAdministrador(administrador:Administrador) : Observable<Object>{
        return this.httpClient.post(`${this.baseURL}`, administrador);
    }
}