import { Component } from '@angular/core';

import { iCar } from '../../models/car';
import { CarsService } from '../../cars.service';

@Component({
  selector: 'app-audi',
  templateUrl: './audi.component.html',
  styleUrls: ['./audi.component.scss'],
})
export class AudiComponent {
  audiCar: iCar[] = [];

  constructor(private carSvc: CarsService) {}

  ngOnInit() {
    this.carSvc.getAudiCar().then((res) => (this.audiCar = res));
  }
}
