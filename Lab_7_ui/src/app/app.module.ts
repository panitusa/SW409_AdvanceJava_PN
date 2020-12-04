import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { ProfileComponent } from './profile/profile.component';
import { RegisterComponent } from './register/register.component';
import {Routes} from '@angular/router';
import {routing} from './app-routing.module';
import {FormsModule} from '@angular/forms';
import {UserService} from './services/user.service.client';
import {CourseService} from './services/blackboard.services.client';
import { BlackboardNavigatorComponent } from './blackboard-navigator/blackboard-navigator.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ProfileComponent,
    RegisterComponent,
    BlackboardNavigatorComponent
  ],
  imports: [
    routing,
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [
    UserService,
    CourseService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
