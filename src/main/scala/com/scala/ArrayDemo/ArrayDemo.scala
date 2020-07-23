package com.scala.ArrayDemo

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    var arr:Array[Int] = Array(1,2,3,4,5)

    // diff form of declaration of array
    var a1:Array[Int] = Array(10,20,30,40,50)
    var a2:Array[Int] = new Array(5)
    var a3:Array[Int] = new Array[Int](10)

    //arr.

    println("Length of array "+arr.length)
    println("Last element in the array "+arr.last)
    println("index number for given value "+arr.indexOf(5))
    println("4th position element "+arr(4))
    println("head of the array"+arr.head)
    println("tail of the array"+arr.tail)
    val tail = arr.tail
    tail.foreach(println)

    var revArr = arr.reverse
    for(x <- revArr){
      println("element of revArr "+x)
    }

    for(x <- arr){
      println("element of arr "+x)
    }
    arr.foreach(println)
  //  arr.
println("=====================================")
    val arrx = new Array[String](5);
    arrx(3)="Vasavi"
    arrx.foreach(println)
    var arrInt = new Array[Int](5);
    arrInt.foreach(println)

    printValues(a1)

  }

  def printValues(arr:Array[Int]): Unit ={
    for(x <- arr){
      println(" Value "+x)
    }
  }
}