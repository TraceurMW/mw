import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LoginRoutingModule } from './login-routing.module';

import { LoginComponent } from './login/login.component';
import {NgZorroAntdModule} from "ng-zorro-antd";


@NgModule({
  declarations: [ LoginComponent],
  imports: [
    CommonModule,
    LoginRoutingModule,
    NgZorroAntdModule
  ]
})
export class LoginModule { }
