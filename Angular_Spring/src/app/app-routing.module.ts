import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaClientesComponent } from './lista-clientes/lista-clientes.component';
import { RegistrarClienteComponent } from './registrar-cliente/registrar-cliente.component';
import { ActualizarClienteComponent } from './actualizar-cliente/actualizar-cliente.component';
import { ClienteDetallesComponent } from './cliente-detalles/cliente-detalles.component';
import { LoginAdminComponent } from './login-admin/login-admin.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {path : 'clientes', component: ListaClientesComponent},
  {path : '', redirectTo: 'clientes', pathMatch:'full'},
  {path : 'registrar-cliente', component: RegistrarClienteComponent},
  {path : 'actualizar-cliente/:id', component: ActualizarClienteComponent},
  {path : 'cliente-detalles/:id', component: ClienteDetallesComponent},
  {path : 'login-admin', component: LoginAdminComponent},
  {path : 'home', component: HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
