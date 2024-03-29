import { Component } from '@angular/core';

import { Todo } from '../../MODELS/todo';
import { TodoService } from '../../SERVICES/todo.service';
import { Users } from '../../MODELS/users';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss',
})
export class HomeComponent {
  todoArr: Todo[] = [];
  utenti?: Users;

  constructor(private todosvc: TodoService) {}

  ngOnInit() {
    this.todoArr = this.todosvc.getAllTodo();
  }
}
