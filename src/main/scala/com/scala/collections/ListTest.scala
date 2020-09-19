package com.scala.collections
import scala.collection.mutable.ListBuffer


/**
  * 789
  * 7+8+9 = 24
  * 2+4 = 6
  * 6*/

object ListTest {
  def main(args: Array[String]): Unit = {
    var list = List(2,4,6,8,10)
    println(list)    
    println(list(2))
    var list2 = List(1,3,5,7,9)

   // list(2) += 11

  //  println("after 11 "+list)


   // val ts = new TreeSet
    
    println(list ++ list2)
    
    list= 20::list

    //list = list :: 30
    
    println(list)
    
    //======ways of creating
    val list1 = 1::2::3::4::Nil
    
   // val list2 = List(1,2,3,4,5)
    
    val lfill = List.fill(4)("scala")
    println(lfill)
    
    val lrange = List.range(1,10)
    println(lrange)
    
    val ltab = List.tabulate(5)(x => x*2)
    println(ltab)
    
    var ladd = List.range(1,10,2)
    println(ladd)
    
    ladd = ladd:::ltab
    
    println(ladd)
    
    
  ladd.foreach(println)
  
  ladd = ladd.map(x => x+2)
  
  println("Map "+ladd)
  
  
  ladd.foreach { x => println(x+2) }
    
   ladd = ladd.filter(x=>x%2==0)
    
    println("filtered "+ladd)
    
       
    //=====listBuffer
    
    var x = "scala"::"spark"::"java"::Nil
    
    var lb = ListBuffer[String]()
    lb.append("spark")
    lb+="scala"
    lb+="Java"
    lb+="Python"
    
    lb+=("Apple","Mango","Orange")
    println(lb)
    
    
    lb-="Apple"
    println(lb)
    
    
   // mutable.TreeSet
    
  }
}