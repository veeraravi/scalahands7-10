package com.scala.firstsession

object WhileLoopDemo {
  def main(args:Array[String]){

    var i = 0

    while(i<=10){
      println(i)
      println("While Demo")
    i = i + 1
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
