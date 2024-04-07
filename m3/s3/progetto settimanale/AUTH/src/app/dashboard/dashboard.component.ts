import { Component } from '@angular/core';
import { AuthService } from '../auth/auth.service';
import { Iuser } from '../modules/iuser';
import { Imovies } from '../modules/imovies';
import { MoviesService } from '../movie/movies.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.scss',
})
export class DashboardComponent {
  constructor(
    private authSvc: AuthService,
    private moviesService: MoviesService
  ) {}
  movieArray: Imovies[] = [];

  user: Iuser | undefined;

  ngOnInit() {
    this.getAllMovies();

    this.authSvc.user$.subscribe((user) => {
      this.user = user || undefined;
    });
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
