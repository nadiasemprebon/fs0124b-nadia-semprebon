import { Component } from '@angular/core';
import { Users } from '../../MODELS/users';
import { Todo } from '../../MODELS/todo';
import { TodoService } from '../../SERVICES/todo.service';

@Component({
  selector: 'app-completed',
  templateUrl: './completed.component.html',
  styleUrl: './completed.component.scss',
})
export class CompletedComponent {
  todoArr: Todo[] = [];
  users: Users[] = [];

  constructor() {}

  ngOnInit() {}
}
