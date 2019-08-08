import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup} from "@angular/forms";
import {en_US, NzI18nService, zh_CN} from "ng-zorro-antd";
import {Service} from "../../services/service";
import { HttpErrorResponse, HttpHeaders, HttpResponse } from '@angular/common/http';
@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  constructor(public service:Service) {}

  ngOnInit(): void {
    this.service
      .get(2)
      .subscribe(
        (res: HttpResponse<any>) => console.log(res),
        (res: HttpErrorResponse) => console.log("fuck")
      );
  }


}
