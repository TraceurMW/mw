import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {OneComponent} from "./exercise/css-secrets/one/one.component";

import {
  MatAutocompleteModule,
  MatButtonModule,
  MatCheckboxModule,
  MatFormFieldModule,
  MatSelectModule,
  MatSidenavModule
} from '@angular/material';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {TwoComponent} from "./exercise/css-secrets/two/two.component";
import {IconsProviderModule} from './icons-provider.module';
import {NgZorroAntdModule, NZ_I18N, zh_CN} from 'ng-zorro-antd';
import {HttpClientModule} from '@angular/common/http';
import {registerLocaleData} from '@angular/common';
import zh from '@angular/common/locales/zh';
import {TemplateModule} from "./template/template.module";
import {Service} from "./services/service";
import {LoginModule} from "./pages/login/login.module";
import {Router} from '@angular/router';
import {SiderFrameModule} from "./pages/sider-frame/sider-frame.module";
import {WelcomeModule} from "./pages/welcome/welcome.module";

registerLocaleData(zh);

@NgModule({
  declarations: [
    AppComponent, OneComponent, TwoComponent
  ],
  imports: [
    BrowserModule, MatSidenavModule
    , BrowserAnimationsModule, MatButtonModule, MatCheckboxModule, ReactiveFormsModule, MatFormFieldModule, MatAutocompleteModule, MatSelectModule, IconsProviderModule, NgZorroAntdModule, FormsModule, HttpClientModule, TemplateModule, LoginModule,SiderFrameModule, AppRoutingModule,WelcomeModule
  ],
  providers: [Service, {provide: NZ_I18N, useValue: zh_CN}],
  bootstrap: [AppComponent]
})
export class AppModule {

}
