import { Component, OnInit } from '@angular/core';
import { Category } from '../category.model';
import { CategoryService } from '../service/category.service';

@Component({
  selector: 'app-filter-task',
  templateUrl: './filter-task.component.html',
  styleUrl: './filter-task.component.css'
})
export class FilterTaskComponent implements OnInit{

  categories!: Category[];

  constructor(private categoryService: CategoryService){
  }

  ngOnInit(): void {
    this.categoryService.findAll().subscribe(data => {
      this.categories = data;
    });
  }

}
