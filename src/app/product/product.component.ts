import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { Product } from '../product'
import { ProductService } from '../product.service';


@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  product:Product;
  toggle: boolean;
  format:any;

  @Output()
  productEmitter = new EventEmitter<Product>();

  constructor(private productService : ProductService) {
    this.product =new Product();
    this.toggle=false;
  
  }

  validate(){
    console.log(this.product);
  }



  ngOnInit() {
  }

  add(){
    this.productEmitter.emit(this.product);
    this.productService.addProduct(this.product).subscribe();
  }

//   delete(){
//     this.productEmitter.emit(this.product);
//     this.productService.deleteProduct(this.product.productId).subscribe();
//  }
 

}
