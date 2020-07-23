package com.scala.functions

object FunctionDemo {
  
  def main(args:Array[String]):Unit = {

    var name:String = "";
    printNames()

    println("*************************")
    val sum = add(10,20)
    println("Sum of 10,20 is "+sum)

    println("************* sum ************")

    val sum2 = add2(20,30)
    println("sum2 "+sum2)
    println(add2(100,200));
    
    println(returnSum(50,30))
    
    println(" add3 without  equal "+add3(10,20));
    
    println("ImmutableTest "+immutableTest(100, 20));
    
    println("Default parameters "+defaultValue());
    
    println("Default parameters 1 "+defaultValue(50));

    println("Default parameters 2 "+defaultValue(100,200));
    
    println("Named parameters 1 "+namedParameters(1,2));
    
    println("Named parameters 2 "+namedParameters(b=1,a=2));
  }


  def printNames(): Unit ={
    println("Scala")
    println("JAVA")
    println("Spark")
    println("Kafka")
  }

  def add(x:Int,y:Int):Int = {
    var sum = 0
    println("X value is "+x)
    println("Y value is "+y)
    sum =x+y
    sum
  }
  
  def add2(x:Int,y:Int)={
     x+y;
    
   // println("Add2 "+(x+y)) //
  }
  
  // when you are using return keyword,
  // we need to specify the return value type
  def returnTest(x:Int):Int={
    return 10;
  }
  
  def returnSum(x:Int,y:Int):Int ={
    return x+y;
  }
  
  /**
   * scala> def xyz(x:Int):Int ={
     | println(x);

     | }
<console>:13: error: type mismatch;
 found   : Unit
 required: Int
       println(x);
              ^
      In the above code, i have specified the return type as Int, 
      but i am not returning anything, so its an exception        
      
   */

  // i want return an expression,
  // i have to use = symbol in declaration
  def add3(x:Int,y:Int)
  {
   val sum =  (x+y)
   println("Add3 "+sum);
  // sum
  }
  
  def immutableTest(x:Int,y:Int) =
  {
   val mul = x*y
   
  mul
    
  }
  //final int x;
  // this.x = 100;
  //
  
  def defaultValue(a:Int=10,b:Int=10):Int = {
    a+b;
  //  a = a+10;
  }
  
  //Named parameters
   def namedParameters(a:Int,b:Int):Int = {
     println("a value "+a);
     println("b Value "+b);
    a+b;
  //  a = a+10;
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}