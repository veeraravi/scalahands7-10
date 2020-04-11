package com.scala.functions

object CommandLineArgsDemo {

  def main(args: Array[String]): Unit = {
/*var arg1 = args(0)
var arg2 = args(1)
var arg3 = args(2)
var arg4 = args(3)
var arg5 = args(4)
var arg6 = args(5)*/

    val Seq(arg1,arg2,arg3,arg4,arg5,arg6) = args.toSeq

    //if(args.length)
  //  args.foreach(println)

   System.out.println(" value of arg1 "+arg1);
   System.out.println(" value of arg2 "+arg2);
   System.out.println(" value of arg3 "+arg3);
   System.out.println(" value of arg4 "+arg4);
   System.out.println(" value of arg5 "+arg5);
   System.out.println(" value of arg6 "+arg6);
  }
}
