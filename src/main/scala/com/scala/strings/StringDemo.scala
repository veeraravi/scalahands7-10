package com.scala.strings

object StringDemo {
  def main(args: Array[String]): Unit = {
    var name: String = "SCALA";

   name = name.concat(" veera")

   val sub =  name.substring(5,10)

    name = name.toUpperCase().concat("VEERA")
    var x = 100;

    var y = "sdfsadf sdf asdf asdg " +
      "asdg asdg asdg asdgadgasdvasds " +
      "fsadgasdg asg sdgasdgasgd"
    var y1 = """sdfsadf sdf asdf asdg
      asdg asdg asdg asdgadgasdvasds
      fsadgasdg asg sdgasdgasgd"""
    println("y "+y)
    println("y1 "+y1)

    println("The value of x is " + x)

    var multiline = """Scala is scalable languare
It runs on JVM
It is object oriented and functional programming"""

    println("************************************************ ")

    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "Hello, Scala!"
    
    println(" this is string with values "+x+floatVar+intVar)
    
    
    
    var fs = printf("The value of the float variable is " +
      "%f, while the value of the integer " +
      "variable is %d, and the string " +
      "is %s", floatVar, intVar, stringVar)
    println(fs)

    printf("The value of the float variable is " +
      "%f, while the value of the integer " +
      "variable is %d, and the string " +
      "is %s", floatVar, intVar, stringVar)
println("====================================")
println(multiline)
  }
}