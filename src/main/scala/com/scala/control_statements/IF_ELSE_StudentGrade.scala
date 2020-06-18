package com.scala.control_statements

object IF_ELSE_StudentGrade {
  def main(args: Array[String]): Unit = {
    print("Enter the marks in Maths :")
    val maths = scala.io.StdIn.readInt()
    print("Enter the marks in Phy :")
    val phy = scala.io.StdIn.readInt()
    print("Enter the marks in Che :")
    val che = scala.io.StdIn.readInt()
    var total = 0;
    var per = 0;
    if(maths > 35 && phy > 35 && che > 35){
      println("Pass : ")
      total = maths+phy+che
      per = (total/300)* 100

      if(per > 75){

      }else if(per > 60 && per < 75){

      }else if()


    }else{
      println("Fail")
    }


  }
}
