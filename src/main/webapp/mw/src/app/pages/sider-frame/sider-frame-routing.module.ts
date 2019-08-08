import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {WelcomeComponent} from "../welcome/welcome.component";
import {SiderFrameComponent} from "./sider-frame.component";


const routes: Routes = [  { path: 'frame', component: SiderFrameComponent,children: [

    {
      path: 'template', loadChildren: './../../template/template.module#TemplateModule',	data:{preload:true}
    }
  ] },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class SiderFrameRoutingModule { }
