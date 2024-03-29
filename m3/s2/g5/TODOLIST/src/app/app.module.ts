import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserComponent } from './COMPONENTS/user/user.component';
import { HomeComponent } from './COMPONENTS/home/home.component';
import { HeaderComponent } from './COMPONENTS/header/header.component';

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    HomeComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
