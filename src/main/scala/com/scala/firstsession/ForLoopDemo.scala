package com.scala.firstsession

object ForLoopDemo {
  var name:String = "SCALA";
  def main(args: Array[String]): Unit = {
    
    var sum = add(10,20);
    println("Sum "+sum);

    println("++++++++++++++++++++++++++++++++")
    for(x <- 1 to 10){
      println("X value "+x)
    }
    println("=============exclude last value (upper bound)==========")
    // exclude last value (upper bound)
    
    for(x <- 1 until 10){
      println("X value "+x)
    }
     println("=======================")
    // for each
    
    var list = List(10,20,30,40,50,60)
    for(i <- list){
      println(i)
    }
    println("============foreach=========== ")
    
    list.foreach{
      println
    }
     println("===========foreach{println}============")
     list.foreach { println }
     
      println("===========1 to 10 by 3============")
      
      // odd numbers
      
      for(x <- 1 to 10 by 3){
        println(x)
        }
     // by 5
     println("==========DIVISIBLE BY 2=============")
     for (x <- 1 to 50 if((x%2 == 0) && (x%x==0))){
       println(x)
     }
     var count:Int = 0
     val num = 10
    for(i <- 1 to num if( num%i == 0)){
      count=count+1
    }
    if(count>2) println("Not Prime") else println("Prime")
      
    println("==========Nested For loop=============") 
    for(x <- 1 to 5;y <- 10 to 13){
      println("X value, Y value  "+(x,y))
    }
    
    
    for(x <- 1 to 5){
      println("X Value "+x)
      println("=================")
      for(y <- 10 to 15){
        println(" Y value "+y);
      }
    }
      
 println("==========Return value from For loop =============")   
 
 var returnValueFromLoop = for(x <- 1 to 5) yield x;
 
 var res = for(i <- 1 to 10 )yield{
   if(i%2 ==0)
   {
     println(i+" is even")
     i*10
   }
   i*10
 }
 
 
  var x = for(i <- 'a' to 'f')yield (if(i == 'c'){
    "hi Scala"  
    });     
  println(x);  
 
       
      
  }
  
  def add(x:Int,y:Int):Int={
   x+y
 }
}