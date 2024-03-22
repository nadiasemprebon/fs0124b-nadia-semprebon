import { Component } from '@angular/core';

@Component({
  selector: 'app-audi',
  templateUrl: './audi.component.html',
  styleUrl: './audi.component.scss',
})
export class AudiComponent {
  audiCar: iCar[] = [];

  constructor(private carSvc: AutoService) {}

  ngOnInit() {
    this.carSvc.getAudiCar().then((res) => (this.audiCar = res));
  }
}
