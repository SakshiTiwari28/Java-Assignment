import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customers: Customer[] =[

    {
      name : "Sakshi",
      birthdate: new Date(4,28,1997)

    },
    {
      name :"Himanshi",
      birthdate : new Date (10,24,1997)
    },
    {
      name:"Shubhra",
      birthdate: new Date(8,16,1997)
    }
  ];
  constructor() { 

  }


     addCustomer(customer:Customer){
     let c:Customer =new Customer();
     c.name =customer.name;
     c.birthdate=customer.birthdate;
    

     this.customers.push(c);
  }


  ngOnInit() {
    this.customers.push(new Customer());
  }

}
