import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SiderFrameRoutingModule } from './sider-frame-routing.module';
import { SiderFrameComponent } from './sider-frame.component';
import {NgZorroAntdModule} from "ng-zorro-antd";


@NgModule({
  declarations: [SiderFrameComponent],
  imports: [
    CommonModule,
    SiderFrameRoutingModule,
    NgZorroAntdModule
  ]
})
export class SiderFrameModule { }
