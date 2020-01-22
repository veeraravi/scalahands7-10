package com.scala.strings

object StringExample {
  def main(args: Array[String]): Unit = {
    
   var name:String = "scala"
   var course:String="scala"
   var s = new String("scala")
   
   println("HashCode of name "+name.hashCode())
   println("HashCode of course "+course.hashCode())
   println("HashCode of s "+s.hashCode())

   println(s"hashcode of name is ${name.hashCode}")



    if(name == course){
     println("name and course are equal")
   }else{
          println("name and course are not equal")
   }
   if(name == s){
     println("name and s are equal")
   }else{
          println("name and s are not equal")
   }
    if(name.eq(s)){
      println("ref name and s are equal")
    }else{
      println("ref name and s are not equal")
    }

    if(name.eq(course)){
      println("ref name and course are equal")
    }else{
      println("ref name and course are not equal")
    }
  }
}