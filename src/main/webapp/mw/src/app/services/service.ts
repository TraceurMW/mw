import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';





@Injectable({ providedIn: 'root' })
export class Service {
  public resourceUrl = "http://127.0.0.1:6689/user/";

  constructor(protected http: HttpClient) {}

  get(id: number): Observable<any> {
    return this.http.get<any>(`${this.resourceUrl}/get/${id}`, { observe: 'response' });
  }
}
