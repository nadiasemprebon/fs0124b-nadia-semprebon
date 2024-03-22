import { Component } from '@angular/core';
import { iCar } from '../../models/car';
import { CarsService } from '../../cars.service';

@Component({
  selector: 'app-fiat',
  templateUrl: './fiat.component.html',
  styleUrl: './fiat.component.scss',
})
export class FiatComponent {
  fiatCar: iCar[] = [];

  constructor(private carSvc: CarsService) {}

  ngOnInit() {
    this.carSvc.getFiatCar().then((res) => (this.fiatCar = res));
  }
}
