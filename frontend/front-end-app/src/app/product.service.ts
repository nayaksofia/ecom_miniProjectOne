import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './product';

//This service file work to interact the front-end with back-end

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(public http:HttpClient) { }

  //For Retrieving Data
  loadProduct():Observable<Product[]>{
    return this.http.get<Product[]>("http://localhost:8080/product/findAll");
  }

  //For Storing Data
  storeProduct(product:any):Observable<string>{
    return this.http.post("http://localhost:8080/product/store",product,{responseType:'text'})
  }
}
