package com.scala.strings

object StringVsStringBufferDemo {
  def main(args: Array[String]): Unit = {
    var course = "scala"
    println("Course value before modify "+course)
    course.concat(" Spark")
    println("Course value after modify "+course)

    val stringBuffer = new StringBuffer("scala")
    println("stringBuffer value before modify "+stringBuffer)
    stringBuffer.append(" Spark")
    println("stringBuffer value after modify "+stringBuffer)
  }
}
