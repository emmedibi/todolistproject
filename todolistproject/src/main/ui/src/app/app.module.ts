import { NgModule } from "@angular/core";
import { AppComponent } from "./app.component";
import { TaskListComponent } from "./task-list/task-list.component";
import { CommonModule } from "@angular/common";
import { HttpClientModule } from "@angular/common/http";
import { AppRoutingModule } from "./app.routes";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { BrowserModule } from "@angular/platform-browser";
import { RouterLink, RouterOutlet } from "@angular/router";
import { TaskService } from "./service/task.service";
import { TaskFormComponent } from "./task-form/task-form.component";
import { FilterTaskComponent } from "./filter-task/filter-task.component";
import { CategoryService } from "./service/category.service";

@NgModule({
    declarations: [
      AppComponent,
      TaskListComponent,
      TaskFormComponent,
      FilterTaskComponent
    ],
    imports: [
      CommonModule,
      AppRoutingModule,
      HttpClientModule,
      FormsModule,
      BrowserModule,
      RouterOutlet,
      RouterLink,
      ReactiveFormsModule
    ],
    providers: [TaskService, CategoryService],
    bootstrap: [AppComponent]
  })

  export class AppModule {}