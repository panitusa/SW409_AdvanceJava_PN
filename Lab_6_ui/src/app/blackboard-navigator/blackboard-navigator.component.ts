import { Component, OnInit } from '@angular/core';
import {CourseService} from '../services/blackboard.services.client';

@Component({
  selector: 'app-blackboard-navigator',
  templateUrl: './blackboard-navigator.component.html',
  styleUrls: ['./blackboard-navigator.component.css']
})
export class BlackboardNavigatorComponent implements OnInit {

  constructor(private courseService: CourseService) { }
  course: [];
  ngOnInit(): void {
    this.courseService.findAllCourses().then(course => this.course = course);
  }

}
