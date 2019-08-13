import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';
import { Routes, RouterModule } from '@angular/router';
import { ProductListComponent } from '../product-list/product-list.component';
import { CustomerListComponent } from '../customer-list/customer-list.component';
import { ProductComponent } from './product.component';
import { DeleteComponent } from '../delete/delete.component';



const productRoutes: Routes = [

  {
    path : 'add-product',
    component: ProductComponent
  },
 
  {
    path: 'view-product',
    component : ProductListComponent
  },
  {
    path: 'delete-product',
    component:DeleteComponent
  }
  
];

// @NgModule({
//   imports: [RouterModule.forChild(productRoutes)],
//   exports: [RouterModule]
// })
// export class AppRoutingModule { }

@NgModule({
  declarations: [],
  imports: [
    CommonModule,RouterModule.forChild(productRoutes)
  ]
})
export class ProductModule { }
