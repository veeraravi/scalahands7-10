package com.scala.functions

import java.util.Date

object PartiallyAppliedFunctions {
  
  def main(args: Array[String]) {
    // normal method call, fully applied function. 
    //that is when we pass all the arguments to function, 
    //that is called fully applied function
 val date = new Date
 //log(date, "message1" )
 //log(date, "message2" )
// log(date, "message3" )
 }
 
  
 // partially applied function
 val logWithDateBound = log(new Date, _ : String)
 logWithDateBound("message1" )
// logWithDateBound("message2" )
// logWithDateBound("message3" )


 def log(date: Date, message: String) = {
 println(date + "----" + message)


 }
 
 

 
   
}