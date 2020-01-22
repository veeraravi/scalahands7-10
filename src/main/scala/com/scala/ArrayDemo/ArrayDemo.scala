package com.scala.ArrayDemo

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    var arr:Array[Int] = Array(1,2,3,4,5)
    //arr.

    println("Length of array "+arr.length)
    println("Last element in the array "+arr.last)
    println("index number for given value "+arr.indexOf(5))
    println("4th position element "+arr(4))
    var revArr = arr.reverse
    for(x <- revArr){
      println("element of arr "+x)
    }

    for(x <- arr){
      println("element of arr "+x)
    }
    arr.foreach(println)
  //  arr.

    val arrx = new Array[String](5);
    arrx(3)="Vasavi"
    arrx.foreach(println)
    var arrInt = new Array[Int](5);
    arrInt.foreach(println)

  }
}