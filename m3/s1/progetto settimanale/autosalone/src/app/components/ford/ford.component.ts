import { Component } from '@angular/core';
import { AutoService } from '../../services/auto.service';
import { iCar } from '../../models/car';

@Component({
  selector: 'app-ford',
  templateUrl: './ford.component.html',
  styleUrls: ['./ford.component.scss'],
})
export class FordComponent {
  fordCar: iCar[] = [];

  constructor(private carSvc: AutoService) {}

  ngOnInit() {
    this.carSvc.getFordCar().then((res) => (this.fordCar = res));
  }
}
