import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { TemplateRoutingModule } from './template-routing.module';
import { TreeListComponent } from './tree-list/tree-list.component';
import {NgZorroAntdModule} from "ng-zorro-antd";
import { ListComponent } from './list/list.component';
import {FormsModule} from "@angular/forms";
import { TestComponent } from './test/test.component';


@NgModule({
  declarations: [TreeListComponent, ListComponent, TestComponent],
  imports: [
    CommonModule,
    TemplateRoutingModule, NgZorroAntdModule, FormsModule,
  ]
})
export class TemplateModule { }
