package com.scala.functions

object FunctionWithVariableNumberOfArgs {
 //101 veera 1000 21-10-1983 03-07
  def main(args: Array[String]) {

   /*val id1 = args(0)
   val name2 = args(1)

   val Seq(id,name,sal,dob,doj) = args.toSeq*/

 //printStrings("Hello", "Scala", "Python","C","");

   val arr = Array("101", "veera", "1000", "21-10-1983","03-07")
   disp(arr)

 /* System.out.println(" printStrings with 1 arg ")
   printStrings(101,"veera")
   System.out.println(" printStrings with 2 arg ")
   printStrings(102,"veera","Scala")
  System.out.println(" printStrings with 3 arg ")
   printStrings(103,"veera","Scala","spark")
*/
   System.out.println(" printStrings1 with 0 arg ")
   printStrings1()
   System.out.println(" printStrings1 with 1 arg ")
   printStrings1("veera")
   System.out.println(" printStrings1 with 2 arg ")
   printStrings1("veera","Scala")
   System.out.println(" printStrings1 with 3 arg ")
   printStrings1("veera","Scala","spark")
   System.out.println(" printStrings1 with 4 arg ")
   printStrings1("veera","Scala","spark","Ravi")

   System.out.println(" printStrings1 with 5 arg ")
   printStrings1("veera","Scala","spark","ravi","kafka")
 }
  //* varargs

 def printStrings1( args:String* ):Unit = {
  var i : Int = 0;
  for( arg <- args ){
   println("Arg value[" + i + "] = " + arg );
   i = i + 1;
  }
 }

 def printStrings2( args:Int* ):Unit = {
  var i : Int = 0;
  for( arg <- args ){
   println("Arg value[" + i + "] = " + arg );
   i = i + 1;
  }
 }

 def printStrings( id:Int,args:String* ):Unit = {
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
 //Array("101", "veera", "1000", "21-10-1983","03-07")
 val Seq(id,name,sal,dob,doj)=args.toSeq
 println("id value : "+id)
 println("name value : "+name)
 println("sal value : "+sal)
 println("date of birth value : "+dob)
 println("date of joining value : "+doj)

}
}