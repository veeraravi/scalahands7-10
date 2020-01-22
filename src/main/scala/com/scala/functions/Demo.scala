package com.scala.functions

object Demo {
  var name:String = "SCALA"


  def main(args:Array[String]): Unit ={
    var x =10;
    var s : String = "VEERARAVI"
    val MIN = 100;
    val str = """HI HALLO, HOW ARE YOU? 
                  vdgfdgdgfds
                  dfgdsgfsdgfds
                  fdfgdsgfdsgf
                  fdsgfdsg
                  """
     var (a:Int,b:Float) = Pair(10,100.0f);
    
    println("VALUE OF X "+ x);
    println("VALUE OF S "+ s);
    println("VALUE OF MIN "+ MIN);
    println("VALUE OF STR "+ str);
    println("VALUE OF A "+ a);
    println("VALUE OF B "+ b);
    println("VALUE OF name"+ name);
    disp()

    println("args "+args(0))

    val sal = getEmpSalById(100)
  }

  def disp(){
    println("VALUE OF name"+ name);
   // println("args "+args(0))
    println("VALUE OF name"+ name);
    // println("args "+args(0))
  }
    
  def getEmpSalById(id:Int):Int ={
    if(id==100) return 10000
    else
      return 5000
  }

}