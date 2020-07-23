package com.scala.objectandclass

class Pen{
  var name ="Idea"
  var typeOfPen = "Ball Pen"
  var color = "black"

  def write():Unit = {
    println("I am writing")
  }
}

class DynamicPen(name:String,typeOfPen:String,size:Int,color:String){

  var name1 = name
  var size1 = size
  var typeOfPen1 = typeOfPen
  var color1 =  color

  def write():Unit = {
    println("I am writing")
  }

}

object ClassAndObjectDemo {
  def main(args: Array[String]): Unit = {

    var celloPen:Pen = new Pen
    println(celloPen.name)
    println(celloPen.typeOfPen)
    println(celloPen.color)
    celloPen.write()

    println("********************")

    var parkerPen = new Pen

    println(parkerPen.name)
    println(parkerPen.typeOfPen)
    println(parkerPen.color)
    parkerPen.write()
  println("**************Dynamic Values**********")

    var ranold = new DynamicPen("Renalyod","point Ball",5,"blue")
    println(ranold.name1)
    println(ranold.typeOfPen1)
    println(ranold.size1)
    println(ranold.color1)
    ranold.write()

    println("*******************")
    var gelPen = new DynamicPen("Link","Gel Point Pen",6,"Green")
    println(gelPen.name1)
    println(gelPen.typeOfPen1)
    println(gelPen.size1)
    println(gelPen.color1)
    gelPen.write()
  }
}
