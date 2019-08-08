import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {OneComponent} from "./exercise/css-secrets/one/one.component";

import {
  MatButtonModule,
  MatCheckboxModule,
  MatSidenavModule,
  MatFormFieldModule,
  MatAutocompleteModule, MatSelectModule
} from '@angular/material';
import { ReactiveFormsModule, FormsModule  } from '@angular/forms';
import {TwoComponent} from "./exercise/css-secrets/two/two.component";
import { IconsProviderModule } from './icons-provider.module';
import { NgZorroAntdModule, NZ_I18N, zh_CN } from 'ng-zorro-antd';
import { HttpClientModule } from '@angular/common/http';
import { registerLocaleData } from '@angular/common';
import zh from '@angular/common/locales/zh';
import {TemplateModule} from "./template/template.module";
import {TreeListComponent} from "./template/tree-list/tree-list.component";
import {Service} from "./services/service";
import {LoginModule} from "./pages/login/login.module";

registerLocaleData(zh);
@NgModule({
  declarations: [
    AppComponent,OneComponent,TwoComponent
  ],
  imports: [
    BrowserModule, MatSidenavModule,
    AppRoutingModule, BrowserAnimationsModule, MatButtonModule, MatCheckboxModule, ReactiveFormsModule, MatFormFieldModule, MatAutocompleteModule, MatSelectModule, IconsProviderModule, NgZorroAntdModule, FormsModule, HttpClientModule,TemplateModule,LoginModule
  ],
  providers: [Service,{ provide: NZ_I18N, useValue: zh_CN }],
  bootstrap: [AppComponent]
})
export class AppModule { }
