import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {TestComponent} from "./test/test.component";
import {FlexTestComponent} from "./flex-test/flex-test.component";
import {TreeListComponent} from "./tree-list/tree-list.component";
import {ListComponent} from "./list/list.component";


const routes: Routes = [
  {path: 'test', component: TestComponent},
  {path: 'flex-test', component: FlexTestComponent}, {path: 'tree-list', component: TreeListComponent},
  {path: 'list', component: ListComponent},
  {path: '', redirectTo: '/list', pathMatch: 'full'},
];


@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class TemplateRoutingModule {
}
