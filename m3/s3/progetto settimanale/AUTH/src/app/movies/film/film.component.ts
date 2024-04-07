import { Component } from '@angular/core';
import { MoviesService } from '../movies.service';
import { Imovies } from '../../modules/imovies';

@Component({
  selector: 'app-film',
  templateUrl: './film.component.html',
  styleUrl: './film.component.scss',
})
export class FilmComponent {
  movieArray: Imovies[] = [];

  constructor(private moviesService: MoviesService) {}

  ngOnInit(): void {
    this.getAllMovies();
  }

  getAllMovies() {
    this.moviesService.getAllMovies().subscribe(
      (data: Imovies[]) => {
        this.movieArray = data;
      },
      (error) => {
        console.error('Error fetching movies:', error);
      }
    );
  }
}
