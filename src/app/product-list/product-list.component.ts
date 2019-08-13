import { Component, OnInit } from '@angular/core';
import { Product } from '../product'
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
products : Product[]=[
  {
   productId:101,
   name:"Tv",
   brand:"sony",
   price:68000
  },
  {
    productId:102,
    name:"Refrigerator",
    brand: "Samsumg",
    price:38493
  }
];
  constructor(private productService : ProductService) {
 }
   
 showProduct(){
   this.productService.getAllProduct().subscribe(data => this.products=data);
 }
  addProduct(product:Product){
     let p:Product =new Product();
     p.productId =product.productId;
     p.name =product.name;
     p.brand =product.brand;
     p.price =product.price;

     this.products.push(p);
  }

  ngOnInit() {
 this.products.push(new Product()); 
 this.showProduct();
  }

}
