import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ProductListComponent } from './product-list/product-list.component';
import { CustomerComponent } from './customer/customer.component';
import { CustomerListComponent } from './customer-list/customer-list.component';
import { OrderComponent } from './order/order.component';
import { CategoryComponent } from './category/category.component';
import { ProductMenuComponent } from './product-menu/product-menu.component';
import { CustomerMenuComponent } from './customer-menu/customer-menu.component';



const routes: Routes = [

  {
    path : 'login',
    component: LoginComponent
  },
  {
    path : 'product-menu',
    component : ProductMenuComponent
  },
  {
    path: 'customer',
    component : CustomerComponent
  },
  {
    path: 'customer-menu',
    component : CustomerMenuComponent
  },
  {
    path:'order',
    component :OrderComponent
  },
  {
    path:'category',
    component:CategoryComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }


