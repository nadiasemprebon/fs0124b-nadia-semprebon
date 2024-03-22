import { Component } from '@angular/core';
import { AutoService } from '../../services/auto.service'; // Aggiunto l'import del servizio
import { iCar } from '../../models/car'; // Aggiunto l'import per iCar

@Component({
  selector: 'app-audi',
  templateUrl: './audi.component.html',
  styleUrls: ['./audi.component.scss'], // Corretto lo stile
})
export class AudiComponent {
  audiCar: iCar[] = [];

  constructor(private carSvc: AutoService) {}

  ngOnInit() {
    this.carSvc.getAudiCar().then((res) => (this.audiCar = res));
  }
}
