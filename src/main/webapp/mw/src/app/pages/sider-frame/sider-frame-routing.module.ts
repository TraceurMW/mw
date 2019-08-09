import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {SiderFrameComponent} from "./sider-frame.component";
import {WelcomeComponent} from "../welcome/welcome.component";
import {ListComponent} from "../../template/list/list.component";


const routes: Routes = [{
  path: 'frame', component: SiderFrameComponent, children: [
    {
      path: 'template', component:ListComponent
    },{
      path: 'welcome', component:WelcomeComponent
    }
  ]
},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class SiderFrameRoutingModule {
}
