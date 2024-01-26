import { Component, OnInit } from '@angular/core';
import { Task } from '../task.model';
import { ActivatedRoute, Router } from '@angular/router';
import { TaskService } from '../service/task.service';
import { Category } from '../category.model';
import { CategoryService } from '../service/category.service';

@Component({
  selector: 'app-task-form',
  templateUrl: './task-form.component.html',
  styleUrl: './task-form.component.css'
})
export class TaskFormComponent implements OnInit{

  task: Task;
  categories!: Category[];

  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private taskService: TaskService,
        private categoryService: CategoryService) {
    this.task = new Task();
  }

  ngOnInit(): void {
    this.categoryService.findAll().subscribe(data => {
      this.categories = data;
    });
  }

  onSubmit() {
    this.taskService.save(this.task).subscribe(result => this.gotoTaskList());
  }

  gotoTaskList() {
    this.router.navigate(['/tasks']);
  }

}
