import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SiderFrameRoutingModule } from './sider-frame-routing.module';
import { SiderFrameComponent } from './sider-frame.component';
import {NgZorroAntdModule} from "ng-zorro-antd";
import {Router} from "@angular/router";


@NgModule({
  declarations: [SiderFrameComponent],
  imports: [
    CommonModule,
    SiderFrameRoutingModule,
    NgZorroAntdModule
  ]
})
export class SiderFrameModule { constructor(router: Router) {
  // Use a custom replacer to display function names in the route configs
  const replacer = (key, value) => (typeof value === 'function') ? value.name : value;

  console.log('Routes: ', JSON.stringify(router.config, replacer, 2));
}

}
