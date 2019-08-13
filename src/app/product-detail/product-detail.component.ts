import { Component, OnInit, Input } from '@angular/core';
import { Product } from '../product';

@Component({
  selector: 'app-product-detail',
  template: `
    <h2> Name of  Product is {{product.name}}</h2>
    <h3>{{product.name}}'s  is {{product.brand}}'s product for {{product.price}}
  `,
  styles : ['h2{color:cadetBlue;}, h3{color:teal}']
  
})

export class ProductDetailComponent implements OnInit {

  @Input()
  product: Product;
  constructor() { }

  ngOnInit() {
  }

}
