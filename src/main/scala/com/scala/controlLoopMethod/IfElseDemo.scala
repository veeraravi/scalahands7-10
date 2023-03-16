package com.scala.controlLoopMethod


class Employee{

}
object IfElseDemo {
 def main(args: Array[String]){
   
  //var age = readInt();
   var age:Int = 24;
  
  if(age >= 18){
    println("Go for vote")
  }else{
    println("go to school")
  }
   
  println("----------------------------")
   
   
   var number:Int = 65  
if(number>=0 && number<50){  
    println ("fail")  
}  
else if(number>=50 && number<60){  
    println("D Grade")  
}  
else if(number>=60 && number<70){  
    println("C Grade")  
}  
else if(number>=70 && number<80){  
    println("B Grade")  
}  
else if(number>=80 && number<90){  
    println("A Grade")  
}  
else if(number>=90 && number<=100){  
    println("A+ Grade")

}  
else println ("Invalid") 

println(getSal())
 }

 def getSal():Double = {
 val x = 100;
 val y = 2000;
 x+y; 
 
 }
 
 
}