package com.scala.strings

object StringExample {
  def main(args: Array[String]): Unit = {
    
   var name:String = "scala"
   var course:String="scala"

   var s = new String("scala")

    println("value of name "+name)
    println("value of course "+course)
    println("value of s "+s)

   println("HashCode of name "+name.hashCode())
   println("HashCode of course "+course.hashCode())
   println("HashCode of s "+s.hashCode())
/*


    name = name.concat("Veera")
    println("value of name after concat "+name)
*/

  // println(s"hashcode of name is ${name.hashCode}")

    // == and equal compare the content
    // eq or ne are used to compare referances
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


    name = name + "Spark"

    println("name "+name)
    println("HashCode of name  "+name.hashCode())


    var sb = new StringBuffer("scala")
    println(" sb "+sb)
    println("hashcode of sb "+sb.hashCode())

    sb.append("Spark")

    println(" sb "+sb)
    println("hashcode of sb "+sb.hashCode())

    var sb2 = new java.lang.StringBuilder("scala")

    println(" sb2 "+sb2)
    println("hashcode of sb2 "+sb2.hashCode())
    sb2.append("Spark")

    println(" sb2 "+sb)
    println("hashcode of sb2 "+sb2.hashCode())

    //sb.

  }
}