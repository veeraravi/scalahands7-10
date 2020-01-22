package com.scala.ArrayDemo

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer

object ArraysTest {
  def main(args: Array[String]): Unit = {
    val arr = Array.range(1, 20);
    arr.foreach(println)
    
    val arrB = ArrayBuffer(1, 2, 20, 30, 20, 30, 20, 40, 50);
    //arrB.con
    
    val l2 = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    
    
    
    val listBuff = new ListBuffer[String]()
    
    println(" Before change "+listBuff.hashCode())

listBuff += "JAVA"
//res96: listBuff.type = ListBuffer(JAVA)

listBuff += "J2EE"
//res97: listBuff.type = ListBuffer(JAVA, J2EE)

listBuff += "SCALA"
//res98: listBuff.type = ListBuffer(JAVA, J2EE, SCALA)
      println(" after change "+listBuff.hashCode())
  
  }
}