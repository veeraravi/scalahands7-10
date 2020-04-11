package com.scala.constructdemos

class ConstructorWithZeroArgs(){
  var id = 0;
  var name = "scala"
  def dispParam(): Unit ={
    println("id = "+id)
    println("name = "+name)
  }
}




object ConstructorWithZeroArgsTest {
  def main(args: Array[String]): Unit = {
    val dcd:ConstructorWithZeroArgs = new ConstructorWithZeroArgs()
  }
}
