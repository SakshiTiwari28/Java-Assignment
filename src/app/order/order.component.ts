import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {

  toggle: boolean;
  format:string;
  constructor() {
    this.toggle=false;
   }

  ngOnInit() {

  }
  changeNgIf(){
    
    this.toggle =!this.toggle;
    this.format=this.toggle?"true":"false";
  }

}
