package com.scala.constructdemos

class StudentCopy(var name:String,var id:Int,var sal:Double){
  
  def this(obj:StudentCopy){
    this(obj.name,obj.id,obj.sal)
    println(obj.name)
    
  }
  
  
}

object CopyConsDemo {
  def main(args: Array[String]): Unit = {
    val sc = new StudentCopy("Ravi",101,1000.0d)
    val r = new StudentCopy(sc)
    println(r.id)
    println(r.name)
    println(r.sal)

    
  }
}