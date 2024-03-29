import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserComponent } from './COMPONENTS/user/user.component';
import { HomeComponent } from './COMPONENTS/home/home.component';

import { FormsModule } from '@angular/forms';
import { CompletedComponent } from './COMPONENTS/completed/completed.component';

@NgModule({
  declarations: [AppComponent, UserComponent, HomeComponent, CompletedComponent],
  imports: [BrowserModule, AppRoutingModule, FormsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
