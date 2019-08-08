import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {WelcomeComponent} from "../welcome/welcome.component";
import {LoginComponent} from "./login/login.component";


const routes: Routes = [
  { path: 'login', component: LoginComponent },
  // {path: '', redirectTo: '/login', pathMatch: 'full'},


];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LoginRoutingModule { }
