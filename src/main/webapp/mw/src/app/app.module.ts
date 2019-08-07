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
import { ReactiveFormsModule  } from '@angular/forms';
import {TwoComponent} from "./exercise/css-secrets/two/two.component";
@NgModule({
  declarations: [
    AppComponent,OneComponent,TwoComponent
  ],
  imports: [
    BrowserModule, MatSidenavModule,
    AppRoutingModule, BrowserAnimationsModule, MatButtonModule, MatCheckboxModule, ReactiveFormsModule, MatFormFieldModule, MatAutocompleteModule, MatSelectModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
