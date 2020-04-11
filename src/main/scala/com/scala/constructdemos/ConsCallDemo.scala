package com.scala.constructdemos

object ConsCallDemo {
  def main(args: Array[String]): Unit = {

    val ravi:AuxiliaryConstructorDemo = new AuxiliaryConstructorDemo



    val raju = new AuxiliaryConstructorDemo("RAVI")
    val veera = new AuxiliaryConstructorDemo(1012102)


    val prasad = new AuxiliaryConstructorDemo("Prasad",26,1012103)
    //prasad.name = "Veera Prasad";  // only getter
    prasad.age = 27; //setter and getter
    //prasad.roll=123456; // only getter
    prasad.sal=1000; //setter and getter
   // prasad.bonus=200; // only getter


  }
}
