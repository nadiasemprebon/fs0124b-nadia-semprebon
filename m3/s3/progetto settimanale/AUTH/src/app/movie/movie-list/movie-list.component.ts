import { Component } from '@angular/core';
import { MoviesService } from '../movies.service';
import { Imovies } from '../../modules/imovies';

@Component({
  selector: 'app-movie-list',
  templateUrl: './movie-list.component.html',
  styleUrl: './movie-list.component.scss',
})
export class MovieListComponent {
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
