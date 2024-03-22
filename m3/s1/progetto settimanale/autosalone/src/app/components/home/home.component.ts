import { Component } from '@angular/core';
import { iCar } from '../../models/car';
import { CarsService } from '../../cars.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss',
})
export class HomeComponent {
  car: iCar[] = [];
  showCar: iCar[] = [];

  constructor(private carSvc: CarsService) {}

  ngOnInit() {
    this.carSvc.getAllCar().then((car) => {
      this.car = car;
      this.generateRandomCars();
    });
  }

  generateRandomCars(): void {
    for (let i = 0; i < 2; i++) {
      let index: number = Math.floor(Math.random() * this.car.length);
      this.showCar.push(this.car[index]);
    }
  }
}
