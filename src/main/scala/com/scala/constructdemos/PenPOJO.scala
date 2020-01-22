package com.scala.constructdemos

import com.scala.access.test.PublicAccess


class PenPOJO(var name:String,var pType:String){
  def print(){
  println("Pen name "+name+" pen Type "+pType)  
  }
  
  println("I am Scala Constructor ")
}

object PenPOJO {
  def main(args: Array[String]): Unit = {
    val p:PublicAccess = new PublicAccess()
    println(p.name)
    println(p.age)
  }
}