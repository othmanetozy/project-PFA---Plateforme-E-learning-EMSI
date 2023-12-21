import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  private APIURL = "http://localhost/8080/api";
  constructor(private httpclient: HttpClient) {}

  login(credentials: { name: string; password: string }): Observable<any> {
    return this.httpclient.post(`${this.APIURL}/login`, credentials);
  }

}
