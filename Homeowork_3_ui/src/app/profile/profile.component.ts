import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import { UserService } from '../services/user.service.client';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  constructor(private activateRoute: ActivatedRoute, private userService: UserService, private router: Router) { }
  userId: Number;
  userName: String;
  password: String;
  ngOnInit(): void {
    this.activateRoute.params.subscribe(params => this.userId = params['userId']);

    const user = this.userService.findUserById(this.userId);
    this.userName = user.username;
    this.userId = user._id;
    this.password = user.password;
  }

}
