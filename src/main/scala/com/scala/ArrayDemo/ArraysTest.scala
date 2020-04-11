package com.scala.ArrayDemo

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer

object ArraysTest {
  def main(args: Array[String]): Unit = {
    val arr = Array.range(1, 20);
    arr.foreach(println)
    
    val arrB = ArrayBuffer(1, 2, 20, 30, 20, 30, 20, 40, 50);
     arrB.reverse
    
    val l2 = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
 /*
 scala> var arrB = ArrayBuffer[Int](1,2,3,4,5)
arrB: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5)

scala> arrB += 6
res3: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5, 6)

scala> val arrB = ArrayBuffer[Int](1,2,3,4,5)
arrB: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5)

scala> arrB += 6
res4: arrB.type = ArrayBuffer(1, 2, 3, 4, 5, 6)

scala> arrB -= 6
res5: arrB.type = ArrayBuffer(1, 2, 3, 4, 5)
  */
    
    
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