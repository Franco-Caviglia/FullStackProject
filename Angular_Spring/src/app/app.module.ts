import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaClientesComponent } from './lista-clientes/lista-clientes.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { RegistrarClientesComponent } from './registrar-clientes/registrar-clientes.component';
import { InfoClienteComponent } from './info-cliente/info-cliente.component';



@NgModule({
  declarations: [
    AppComponent,
    ListaClientesComponent,
    RegistrarClientesComponent,
    InfoClienteComponent
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
