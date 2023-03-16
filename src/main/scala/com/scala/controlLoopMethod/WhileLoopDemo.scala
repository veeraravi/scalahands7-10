package com.scala.controlLoopMethod
object WhileLoopDemo {
  def main(args:Array[String]){

    var i = 100

    while(i%5==0 || i >= 0){
      println(i)
      println("While Demo")
     i = i - 1
    }

    /*while(true){
      println(i)
      println("While Demo")

         }
*/
   var flag = true
    /*
    while(flag){
      ......
      if(){
      flag=false  
      }
      
    }
    while(true){
      
    }*/

    println("====== Do-while =====")
    var j =1;
    
    do{
      j = j+1
      println(j)
      println("Do-While Demo")
    }while(false)
    
}
}
