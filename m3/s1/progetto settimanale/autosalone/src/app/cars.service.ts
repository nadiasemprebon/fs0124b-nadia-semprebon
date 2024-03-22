import { Injectable } from '@angular/core';
import { iCar } from './models/car';

@Injectable({
  providedIn: 'root',
})
export class CarsService {
  getAllCar(): Promise<iCar[]> {
    return fetch('../assets/db.json')
      .then((res) => res.json())
      .then((res: iCar[]) => res);
  }

  getFiatCar(): Promise<iCar[]> {
    return this.getAllCar().then((res) =>
      res.filter((p) => p.brand === 'Fiat')
    );
  }

  getFordCar(): Promise<iCar[]> {
    return this.getAllCar().then((res) =>
      res.filter((p) => p.brand === 'Ford')
    );
  }

  getAudiCar(): Promise<iCar[]> {
    return this.getAllCar().then((res) =>
      res.filter((p) => p.brand === 'Audi')
    );
  }
}
