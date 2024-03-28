import { Injectable } from '@angular/core';
import { iInterface } from '../MODELS/interface';
import { HttpClient } from '@angular/common/http';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class SeviceService {
  apiUrl: string = 'https://jsonplaceholder.typicode.com/photos';

  arrayPictures: iInterface[] = [];

  photoSubject = new Subject<iInterface[]>();
  $photo = this.photoSubject.asObservable()
  constructor(private http: HttpClient) {
    this.getAllPictures().subscribe()
    getAllPictures(){
      return this.http.get<iInterface[]>(this.apiUrl)
    }
  }
}
