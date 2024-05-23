import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent implements OnInit{

  //Create an Array of Product Type
  products: Array<Product> = [];

  constructor(public ps: ProductService){}

  ngOnInit(): void {
    //It called automatically when the component was loaded 
    this.loadProduct();
  }

//For store the product we should create a form group for template
 productRef = new FormGroup({
  pid : new FormControl(),
  pname : new FormControl(),
  price : new FormControl()
 });


  loadProduct():void{
    this.ps.loadProduct().subscribe({
      next:(result:any) =>{
        this.products=result;   //First Method : next()
      },
      error:(error:any) =>{
        console.log(error);     //Second Method: error()
      },
      complete:() => {          //Third Method: complete()                     
        console.log("Done!!!")
      }
    }); //End of subscribe()
  }
 

  
  msg:string="";
 
  storeProduct():void{
   let product = this.productRef.value;
   this.ps.storeProduct(product).subscribe({

    next:(result)=> {          //First Method: next()
      this.msg = result;
    },
    error:(error:any) => {     //Second Method: error()
      console.log (error);
    },

    complete:()=>{            //Third Method : complete()
      this.loadProduct();
      console.log("Done!!!");
    }  
   }); //End of subscribe()

  this.productRef.reset();

  }

}
