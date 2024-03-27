import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { iProduct } from '../Models/product';

@Injectable({
  providedIn: 'root',
})
export class ServiceService {
  apiUrl: string = 'https://dummyjson.com/products';

  constructor(private http: HttpClient) {}

  getAll() {
    return this.http.get<iProduct[]>(this.apiUrl);
  }
}
