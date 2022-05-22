import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-app';
  greet="h";
  num=0;
  x = 6;
 getGreet(x:String){
   return x;
 }
 getName(y:String){
   alert(y);
 }
 getNum(){
   return this.x;
 }
 counter(s:string){
   if(s=='add')
   return this.num++;
   else
   return this.num--;
 }
 inc(){
  return this.num++;
 }
 dec(){
  
  if(this.num==0)
  return 0;
  else 
  return this.num--;
 }
 dispVal:String='';
 name="abc";
 disabledBox:boolean=true;
 choose(){
   if(this.disabledBox==true)
   this.disabledBox=false;
   else this.disabledBox=true;
 }
 getValue(val:any){
   this.dispVal=val;
   console.log(val);
 }
}
