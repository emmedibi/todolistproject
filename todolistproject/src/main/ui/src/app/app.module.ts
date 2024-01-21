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

@NgModule({
    declarations: [
      AppComponent,
      TaskListComponent
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
    providers: [TaskService],
    bootstrap: [AppComponent]
  })

  export class AppModule {}