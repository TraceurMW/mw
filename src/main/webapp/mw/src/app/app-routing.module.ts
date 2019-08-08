import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TreeListComponent} from "./template/tree-list/tree-list.component";
import {ListComponent} from "./template/list/list.component";
import {TestComponent} from "./template/test/test.component";

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: '/welcome' },
  { path: 'welcome', loadChildren: () => import('./pages/welcome/welcome.module').then(m => m.WelcomeModule) },
  {path:'tree-list',component:TreeListComponent},
  {path:'list',component:ListComponent},
  {path:'test',component:TestComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
