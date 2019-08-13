import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';
import { Routes, RouterModule } from '@angular/router';
import { ProductListComponent } from '../product-list/product-list.component';
import { CustomerListComponent } from '../customer-list/customer-list.component';
import { CustomerComponent } from './customer.component';



const customerRoutes: Routes = [

  {
    path : 'add-customer',
    component: CustomerComponent
  },
 
  {
    path: 'view-customer',
    component : CustomerListComponent
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
    CommonModule,RouterModule.forChild(customerRoutes)
  ]
})
export class CustomerModule { }
