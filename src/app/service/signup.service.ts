import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../dto/user';


@Injectable({
  providedIn: 'root'
})
export class SignupService {

  _url='http://localhost:8087/api/users';

  constructor(private http: HttpClient) { }

  register(user: User){
    return this.http.post<any>(this._url, user);
  }
}
