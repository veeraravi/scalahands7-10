package com.scala.tuples

object TupleDemo {
  
  val age = 20;
  
  def main(args: Array[String]): Unit = {
    
    val tuple2 = (10,20);
    val strTuple = ("scala","spark","java")
    
    println("Numbers "+tuple2._2)
    println("String "+strTuple._3)
    
    val tuple  = ("RAVI",32,"MCA",1000.50)

   val tuple22  = ("RAVI",32,"MCA",1000.50,"RAVI",32,"MCA",1000.50,"RAVI",32,"MCA",1000.50,"RAVI",32,"MCA",1000.50,"RAVI",32,"MCA",1000.50,"RAVI",32)


    val (name,age,quli,sal) = tuple

    println("name "+name)
    println("age "+age)
    println("qulification "+quli)
    println("salary "+sal)
    
    
    println("caling testTuple "+testTuple())
    
    val res = testTuple();
    println(res._1)
    
  }
  def testTuple()={
    println("I am from tuple")
    val record = ("RAVI",33,10000.00,"USA")
    record
  }
}