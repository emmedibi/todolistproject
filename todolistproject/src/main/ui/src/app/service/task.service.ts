import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Task } from '../task.model';

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  private basUrl = "http://localhost:8080/tasks"

  constructor(private httpClient: HttpClient) { }

  findAll(): Observable<Task[]> {
    return this.httpClient.get<Task[]>(`${this.basUrl}`);
  }

  save(task: Task): Observable<Object> {
    return this.httpClient.post(`${this.basUrl}`, task);
  }
}
