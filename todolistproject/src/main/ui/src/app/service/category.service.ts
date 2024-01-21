import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Category } from '../category.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  private basUrl = "http://localhost:8080/category"

  constructor(private httpClient: HttpClient) { }

  getCategoryList(): Observable<Category[]> {
    return this.httpClient.get<Category[]>(`${this.basUrl}/getAllCategory`);
  }

  createCategory(category: Category): Observable<Object> {
    return this.httpClient.post(`${this.basUrl}/addCategory`, category);
  }
}
