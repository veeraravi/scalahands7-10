package com.scala.functions

object FunctionWithVariableNumberOfArgs {
 //101 veera 1000 21-10-1983 03-07
  def main(args: Array[String]) {

   val id1 = args(0)
   val name2 = args(1)


   val Seq(id,name,sal,dob,doj) = args.toSeq



 printStrings("Hello", "Scala", "Python","C","");

   val arr = Array("1","2","3","4")
   disp(arr)
  // printStrings(arr);
 }
  //* varargs
 def printStrings( args:String* ) = {
 var i : Int = 0;
 for( arg <- args ){
 println("Arg value[" + i + "] = " + arg );
 i = i + 1;
 }
 }



def disp(args:Array[String]): Unit ={
 for(arg <- args ){
  println("ARGS "+arg)
 }
 val Seq(id,name,sal,dob)=args.toSeq
 println(id)
 println(name)
 println(sal)
 println(dob)

}
}