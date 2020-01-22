package com.scala.functions

object HOFDemo {
  def main(args: Array[String]): Unit = {
    
  }
  
  def sumNums(start:Int,end:Int):Int ={
    if(start > end) 0
    else start + sumNums(start+1,end)
  }

  def cube2 = (x:Int) => x*x*x


  def cube(x:Int):Int= {
    x*x*x
  }
  
  def sumCubes(x:Int,y:Int):Int ={
    if(x>y)0
    else cube(x)+sumCubes(x+1, y);
  }
  
  def fact(x:Int):Int ={
    if(x <= 1) 1
    else
      x * fact(x-1);
  }
  
  def sumFacts(x:Int,y:Int):Int ={
    if(x>y)0
    else fact(x)+sumFacts(x+1, y)
  }
 //================



  def sums(f:Int => Int,x:Int,y:Int):Int ={

    if(x > y) 0
    else
      f(x) + sums(f,x+1,y);//5+sums(num,6,5) == 5+0 = 5
  }


  def num(a:Int):Int = a;



  def sumNums2(x:Int,y:Int) = sums(num,x,y)
  def sumCubes2(x:Int,y:Int) = sums(cube,x,y)
  def sumFacts2(x:Int,y:Int) = sums(fact,x,y);


  println("**** sumNums2 *** "+sumNums2(5,5))
  println("*** sumCubes2 *** "+sumCubes2(3,3))
  println("*** sumFacts2 *** "+sumFacts2(4,4))




  
  def add(x:Int,y:Int):Int ={
    x+y
  }
  
  def sub(x:Int,y:Int):Int ={
    x-y
  }
  
  def operations(x:Int,y:Int,z:Int,f:(Int,Int)=>Int):Int={
    f(f(x,y),z)
  }
}