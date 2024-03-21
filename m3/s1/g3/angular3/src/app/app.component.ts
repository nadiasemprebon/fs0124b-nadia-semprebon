import { Component } from '@angular/core';
import { ibooks } from './models/books';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss',
})
export class AppComponent {
  title = 'angular3';

  booksArr: ibooks[] = [];

  ngOnInit() {
    fetch('../assets/db.json')
      .then((pippo) => pippo.json())
      .then((pippo) => {
        this.booksArr = pippo.posts;
      });
  }
}
