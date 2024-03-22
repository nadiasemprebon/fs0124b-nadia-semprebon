import { Component } from '@angular/core';
import { iCar } from '../../models/car';
import { CarsService } from '../../cars.service';

@Component({
  selector: 'app-ford',
  templateUrl: './ford.component.html',
  styleUrls: ['./ford.component.scss'],
})
export class FordComponent {
  fordCar: iCar[] = [];

  constructor(private carSvc: CarsService) {}

  ngOnInit() {
    this.carSvc.getFordCar().then((res) => (this.fordCar = res));
  }
}
