import { Component, OnInit, Input } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {
 
  @Input()
  products: Product[];

  constructor(private productService : ProductService) { 
  
  }

  ngOnInit() {
  }

  // delete(productId:number){
   
  //    this.productService.deleteProduct(productId).subscribe();
    
  // }
  delete(productId:number) {
    this.productService.deleteProduct(productId).subscribe(result => {
      console.log(result);
    
      });
   
}

}
