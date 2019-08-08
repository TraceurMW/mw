import { Injectable } from '@angular/core';
import {HttpClient, HttpErrorResponse, HttpResponse} from '@angular/common/http';
import { Observable } from 'rxjs';
import {BASE_URL} from "../app.constants";

@Injectable({ providedIn: 'root' })
export class Service {
  // public resourceUrl = BASE_URL+ "/user";
  public resourceUrl = "/user";

  constructor(protected http: HttpClient) {}

  get(id: number): Observable<any> {
    return this.http.get<any>(`${this.resourceUrl}/get/${id}`, { observe: 'response' });
  }

//   this.service
// .get(2)
// .subscribe(
// (res: HttpResponse<any>) => console.log(res),
// (res: HttpErrorResponse) => console.log("fuck")
// );
}
