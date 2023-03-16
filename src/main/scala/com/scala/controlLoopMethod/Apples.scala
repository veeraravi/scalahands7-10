package com.scala.controlLoopMethod

object Apples {
  var numberApples=2
  
def getApples()={
println("APPLES IN METHOD "+numberApples)
numberApples += 1;
numberApples
}

val getApplesWithBlock = (numberApples:Int) => {
println("APPLES IN BLOCK "+numberApples)
var x = numberApples + 1; // numberApples = numebrApples + 1
x
}
def main(args: Array[String]): Unit = {
  
  
  var y = getApples();
  println(y)
  
  var z = getApples();
  println(z);
  
  var i = getApplesWithBlock(10);
  println(i);
  
  var j = getApplesWithBlock(10);
  println(j);
}

}

