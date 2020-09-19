package com.scala.collections

object SeqDemo {
  def main(args: Array[String]): Unit = {
    val seq1 = Seq(1,3,1,2,7,10,11,15)
    //index
    println("value in 5th position  "+seq1(5))
    //insertion order
    println("values  "+seq1)

    // iteration
    seq1.foreach(println)

    seq1.foreach(ele => print(ele+ "  "))

    // common methods used in Seq

    println("Reverse insertion order  "+seq1.reverse)
    println("Head element of the sequence  "+seq1.head)
    println("tail element of the sequence  "+seq1.tail)
    println("last element of the sequence  "+seq1.last)
    println("serach for an element in the sequence  "+seq1.contains(10))
    println("Check the sequence is empty or not  "+seq1.isEmpty)
    println("Max Element in the sequence   "+seq1.max)
    println("min Element in the sequence   "+seq1.min)
  //  println("Check the sequence is empty or not  "+seq1.isEmpty)



  }
}
