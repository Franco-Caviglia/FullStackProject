import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaClientesComponent } from './lista-clientes/lista-clientes.component';
import { RegistrarClientesComponent } from './registrar-clientes/registrar-clientes.component';



const routes: Routes = [
  {path : 'clientes', component: ListaClientesComponent},
  {path : '', redirectTo: 'clientes', pathMatch:'full'},
  {path : 'registrar', component: RegistrarClientesComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
