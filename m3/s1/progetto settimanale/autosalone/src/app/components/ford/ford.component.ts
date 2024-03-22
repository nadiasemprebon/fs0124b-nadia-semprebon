import { Component } from '@angular/core';

@Component({
  selector: 'app-ford',
  templateUrl: './ford.component.html',
  styleUrl: './ford.component.scss',
})
export class FordComponent {
  fordCar: iCar[] = [];

  constructor(private carSvc: AutoService) {}

  ngOnInit() {
    this.carSvc.getFordCar().then((res) => (this.fordCar = res));
  }
}
