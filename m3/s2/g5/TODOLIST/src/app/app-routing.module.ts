import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './COMPONENTS/home/home.component';
import { UserComponent } from './COMPONENTS/user/user.component';
import { CompletedComponent } from './COMPONENTS/completed/completed.component';

const routes: Routes = [
  { path: 'completed', component: CompletedComponent },
  {
    path: '',
    component: HomeComponent,
  },

  {
    path: 'users',
    component: UserComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
