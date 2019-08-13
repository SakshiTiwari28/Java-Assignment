import { Component, OnInit, Input } from '@angular/core';
import { Customer } from '../customer';

@Component({
  selector: 'app-customer-detail',
  template: `
    <h2> Name of  customer is {{customer.name}}</h2>
    <h3>{{customer.name}}'s BirthDate is {{customer.birthdate| date: 'shortDate'}}</h3>
  `,
  styles : ['h2{color:cadetBlue;}, h3{color:teal}']
  
})
export class CustomerDetailComponent implements OnInit {
 
  @Input()
  customer : Customer;
  constructor() { }

  ngOnInit() {
  }

}
