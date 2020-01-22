package com.scala.constructdemos

object Test {
  def main(args: Array[String]): Unit = {
    val obj = new primaryConstructorDemo("hadoop","spark");
    obj.name();
    println("==========Auxiliray Constructor============ ")
    
    val au0 = new AuxiliaryConstructorDemo();
    println(au0)
    au0.show()
    val au1 = new AuxiliaryConstructorDemo("Veera1");
     au1.show();
   val au2 = new AuxiliaryConstructorDemo("VEERA2",10);
   au2.show();
   val au3 = new AuxiliaryConstructorDemo("VEERA3",10,20);
    au3.show();
    val au4 = new AuxiliaryConstructorDemo(100);
     au4.show();
   
    println("==========Default Value Constructor============ ")
    val x = new DefaultValueConstructor()
    val y = new DefaultValueConstructor("RAVI","BABU")
    println(x)
    println(y)
    
    
    
  }
}
