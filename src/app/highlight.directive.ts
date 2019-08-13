import { Directive, ElementRef, HostListener } from '@angular/core';


@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective {

  constructor(  public ele : ElementRef) {}
    


     //native element is used to refer to the html element
    changeColor(color:string){
      this.ele.nativeElement.style.backgroundColor = color;
    }

      @HostListener('mouseenter')
      onmouseenter(){
        this.changeColor('gray');
      }
     @HostListener('mouseleave')
    onmouseleave()
    {
      this.changeColor(null);
    }
   
   }