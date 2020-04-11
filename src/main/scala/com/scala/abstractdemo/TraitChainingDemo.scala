package com.scala.abstractdemo

abstract class Writer{
      def write(msg:String)
     // val name;
      }

class StringWriter extends Writer{
      val target = new StringBuffer
     def write(msg:String)={
        println("I am from string writer")
      target.append(msg)
      }
      override def toString() = target.toString()
            }

/*class FileWriter2 extends Writer{
  def write(test:String){
    
  }
}*/

trait profanityFilter extends Writer{
 // val name:Int;
         abstract override def write(msg:String)={
         println(" called PROFANITY with message "+msg)
         super.write(msg.toLowerCase.replace("stupid","st****"))
         }
         }

 trait UpperCaseFilter extends Writer{
            abstract override def write(msg:String)={
              println(" called UPPER with msg "+msg)
            super.write(msg.toUpperCase)
            }
            }

 
 
 
 
object TraitChainingDemo {

  // factory which take child type object
  def writeStuff(writeVariable:Writer)={
            writeVariable.write("this is stupid")
            println(writeVariable)
            }
  def main(args: Array[String]): Unit = {
    
    
    val test:Writer = new StringWriter();
  // val filetest:Writer = new FileWriter2();
    
    
    val str:StringWriter = new StringWriter();
    writeStuff(str)
    
    println("========================")
    
    val str2 = new StringWriter with UpperCaseFilter
    
    writeStuff(str2)
    
     println("========================")
    
    val str3 = new StringWriter with UpperCaseFilter with profanityFilter
    
    writeStuff(str3)
    
     println("========================")
    
    val str4 = new StringWriter with profanityFilter with UpperCaseFilter
    
    writeStuff(str4)
    
    // writeStuff(str)
    /* writeStuff(new StringWriter with UpperCaseFilter)
     writeStuff(new StringWriter with profanityFilter) 
     writeStuff(new StringWriter with UpperCaseFilter with profanityFilter)
     writeStuff(new StringWriter with profanityFilter with UpperCaseFilter)*/
     
     
     /*val str2 = new StringWriter with UpperCaseFilter
     val str3 = new StringWriter with profanityFilter
     val str4 = new StringWriter with UpperCaseFilter with profanityFilter
     ///msg replce is case-sencitive so, msg is not replaced
     val str5 = new StringWriter with profanityFilter with UpperCaseFilter 
     
     writeStuff(str2)
     println("***********1************");
     writeStuff(str3) 
     println("************2***********");
     writeStuff(str4)
     println("************3***********");
     writeStuff(str5)*/
    
    
    
    
  }
}