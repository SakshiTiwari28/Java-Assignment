import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  

  constructor(private http : HttpClient) {
   }
   getAllProduct(){
     return this.http.get<Product[]>('http://localhost:8082/product');
   }

   addProduct(product: Product){
      return this.http.post('http://localhost:8082/product',product)
   }
   deleteProduct(productId:number){
      return this.http.delete('http://localhost:8082/product'+productId)
    
   }
}
