package com.scala.strings

object StringMethodDemo {
  def main(args: Array[String]): Unit = {
    var name = "Scala cook Book";
    println(name.toCharArray())
    println(name.toUpperCase())
    println(name.+(" Alex"))
    println(name.length())
    println(name.hashCode())
  //  name.
    var subStr = name.substring(5,9)
    println(subStr)
    
    
    val ca = name.toCharArray();
    ca.foreach { x => println("char is "+x) }
    
    val name1 = "Scala cook Book";
    val name2 = "hadoop definitive guide"
    val name3 = "learning spark"
    
    if(name == name1){
      println("both are ==")
    }else{
      println("both are !=")
    }
    if(name.equals(name1)){
      println("both are equals")
    }else{
      println("both are not equals")
    }
    
    if(name == name2){
      println("both are ==")
    }else{
      println("both are !=")
    }
    
    val splitTest = name.split("\\s")
    
        splitTest.foreach(println)
        
        name="manoj";
    name = name.concat("kumar")
    name = null;
   // println(splitTest.toString())
    
    
  }
}