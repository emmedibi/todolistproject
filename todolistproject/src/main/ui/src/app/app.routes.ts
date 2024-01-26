import { RouterModule, Routes } from '@angular/router';
import { TaskListComponent } from './task-list/task-list.component';
import { NgModule } from '@angular/core';
import { TaskFormComponent } from './task-form/task-form.component';

export const routes: Routes = [
    { path: 'tasks', component: TaskListComponent },
    { path: 'addtask', component: TaskFormComponent }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })
  export class AppRoutingModule { }