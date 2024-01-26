import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Category } from '../category.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  private basUrl = "http://localhost:8080/categories"

  constructor(private httpClient: HttpClient) { }

  findAll(): Observable<Category[]> {
    return this.httpClient.get<Category[]>(`${this.basUrl}`);
  }

  save(category: Category): Observable<Object> {
    return this.httpClient.post(`${this.basUrl}`, category);
  }

}
