import { Component, OnInit } from '@angular/core';
import { TaskService } from '../service/task.service';
import { Task } from '../task.model';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrl: './task-list.component.css'
})
export class TaskListComponent implements OnInit{

  tasks!: Task[];

  constructor(private taskService: TaskService){
  }

  ngOnInit(): void {
    this.taskService.findAll().subscribe(data => {
      this.tasks = data;
    });
  }
}
