package com.scala.secondsession

object ArrayDemo {
  
  def main(args: Array[String]): Unit = {
    
    var fruits:Array[String] = Array("Apple","mango","orange","grapes")
    
    fruits.foreach(println)
    
    fruits.foreach { 
      x => println(x.toUpperCase())
    //  println(x)
      }
    
    
  fruits.foreach { x => {
      var d = x.toUpperCase()
      println(d)}   
    }
    
 
  }
}