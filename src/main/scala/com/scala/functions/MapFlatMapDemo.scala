package com.scala.functions

case class Employee(id:Int,name:String,age:Int,gender:String,sal:Double)


object MapFlatMapDemo {
  def main(args: Array[String]): Unit = {
    val data = Array(1,2,3,4,5,6,7,8,9,10)
    val arrays = Array(Array(0,1,2),
      Array(1,2,3),
      Array(2,3,4))
    //map
    val mapTest = data.map(ele => ele+1)

    println(" map method output ")
      mapTest.foreach(println)

    val maptest2 = arrays.map(ele => ele(0)*10)

    println("-----------------------------")
   val str =Array(Array("scala","is","simple","programming","lanaguage"),
     Array("functional", "programming","language"),
     Array("scala","is", "pure", "functional"))
   //val splitted = str.split()

     val flatMapTest = str.flatMap(ele => ele)
    for(ele <- flatMapTest){
      println("flatmap1 "+ele)
    }

   /* println(" flatmap method output ")
    flatMapTest.foreach(println)*/

    val arrays2 = Array(Array(0,1,2))
    // 1:may
    val flatMapTest2 = arrays.flatMap(ele => ele)


    for(ele <- flatMapTest2){
      println("flatmap2 "+ele)
    }

// filter

    val list1 = List(1,2,3,0,4,-1,8,9,10,-2,5)
    val resGt2 = list1.filter(x => x>2)
    resGt2.foreach(println)

 //find returns first matched value
 val findres = list1.find(ele => (ele==10))

 //partition
 val res = list1.partition(x => x>=0)
   // res: (List[Int], List[Int]) = (List(1, 2, 3, 0, 4, 8, 9, 10, 5),List(-1, -2))
//fold foldLeft foldRight
    /*
    foldLeft(0)(_+_)
    * 0+1 ===> 1
    * 1+2 ===> 3
    *
    * */
   // val resFold = list1.foldLeft(0)(_+_)
    val resFold1 = list1.foldLeft(0)(_+_)
   // resFold1: Int = 39

    val resFold2 = list1.foldLeft(10)(_+_)
   // resFold2: Int = 49

    val resFold3 = list1.foldRight(10)(_+_)
  //  resFold3: Int = 49

    val resFold4 = list1.fold(10)(_+_)
   // resFold4: Int = 49

    //reduceLeft reduceRight

    /*
    List(1,2,3,0,4,-1,8,9,10,-2,5)
    reduceLeft(_+_)
    * 1+2 ===> 3
    * 3+3 ===> 6
    * 6+0 ===>6
    * 6+4 ===> 10
    *
    *
    *  list1.reduceLeft(getMax)
 compare 1 and 2 , 2 is bigger
 compare 2 and 3 , 3 is bigger
 compare 3 and 0 , 3 is bigger
 compare 3 and 4 , 4 is bigger
 compare 4 and -1 , 4 is bigger
 compare 4 and 8 , 8 is bigger
 compare 8 and 9 , 9 is bigger
 compare 9 and 10 , 10 is bigger
 compare 10 and -2 , 10 is bigger
 compare 10 and 5 , 10 is bigger
res0: Int = 10
    * */

    val reduceRes1 = list1.reduceLeft((a,b) => a+b)
    val reduceResAdd = list1.reduceLeft(_+_)
    val reduceResMul = list1.reduceLeft(_ * _)
    val reduceResMin = list1.reduceLeft(_ min _)
    val reduceResMax = list1.reduceLeft(_ max _)


    val res1 = list1.reduceLeft(getMax)

    val res2 = list1.foldLeft(1)(getMax)

    val res3 = list1.reduceLeft((a,b)=> if(a > b) b else a)

//
    val ravi:Employee = Employee(1001,"Ravi",35,"Male",1000.00)
    val veera:Employee = Employee(2001,"Veera",36,"Male",11000.00)
    val kumar:Employee = Employee(2002,"Kumar",35,"Male",500.00)
    val Venkat:Employee = Employee(10003,"Venkat",28,"Male",21000.00)
    val Prapoorna:Employee = Employee(1002,"Prapoorna",16,"Female",31000.00)

    val empList = List(ravi,kumar,veera,Venkat,Prapoorna)

















  }

  def getMax(a:Int,b:Int):Int ={
     println(s" compare $a and $b , ${a max b} is bigger")
     a max b
  }
def addTitles(a:Any,b:Any): String ={
  /*val title = b.gender match {
    case "Male" => "Mr."
    case "Female"  => "Ms."
  }
  val res = s"${b.id},$title ${b.name},${b.age}, ${b.gender},${b.sal}"
*/
  "res"
}

}
