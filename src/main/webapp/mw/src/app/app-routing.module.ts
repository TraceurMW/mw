import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {OneComponent} from "./exercise/css-secrets/one/one.component";
import {TwoComponent} from "./exercise/css-secrets/two/two.component";


const routes: Routes = [
  {
    path:"",redirectTo: 'css', pathMatch: 'full' ,
  },{
    path:"css",component:OneComponent
  },{
    path:"one",component:OneComponent
  },{
    path:"two",component:TwoComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
