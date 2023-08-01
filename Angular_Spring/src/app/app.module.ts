import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaClientesComponent } from './lista-clientes/lista-clientes.component';
import { HttpClientModule } from '@angular/common/http';
import { RegistrarClienteComponent } from './registrar-cliente/registrar-cliente.component'
import { FormsModule } from '@angular/forms';
import { ActualizarClienteComponent } from './actualizar-cliente/actualizar-cliente.component';
import { ClienteDetallesComponent } from './cliente-detalles/cliente-detalles.component';
import { LoginAdminComponent } from './login-admin/login-admin.component';
import { HomeComponent } from './home/home.component';
@NgModule({
  declarations: [
    AppComponent,
    ListaClientesComponent,
    RegistrarClienteComponent,
    ActualizarClienteComponent,
    ClienteDetallesComponent,
    LoginAdminComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
