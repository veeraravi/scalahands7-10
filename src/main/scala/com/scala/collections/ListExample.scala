package com.scala.collections

object ListExample {
  def main(args: Array[String]): Unit = {

    val list0 = 1::2::3::4::5::Nil
  //  list0.init
    val list1 = List(1,2,3,5,6,7)
    val list2 = List.range(1,20)
    val list3 = List.fill(4)(1) //fills a list with an element which is mentioned 2nd arg
                                //1 arg is no of times
    val list4 = List.range(1,20,2)
    var list6 = List.tabulate(5)(ele => ele * ele)

    val list7:List[Int] = List(1,4,3,6,7,9,10,7)

    println("List0 "+list0)
    println("List1 "+list1)
    println("List2 "+list2)
    println("List3 "+list3)

    println("List1 0 postion  "+list1(0))
    println("List2 15 position "+list2(15))
    println("List4 5 position "+list4(5))

    println("concat of List4 with list2 "+(list4:::list2))
    println("concat of List4 with list2 "+(list4++list2))
    println("concat of List4 with list2 "+List.concat(list4,list2,list0))

val listOfList = List(list0,list2,list4)
    println("List of lists  "+listOfList)
    println("flatten List of lists  "+listOfList.flatten)
    println("distinct without flatten List of lists  "+listOfList.distinct)
    println("distinct with flatten List of lists  "+listOfList.flatten.distinct)
  //  println("flatten list4  "+list4.flatten)



    list0.foreach(println)
println("****************")
    for(l <- list1){
      println(l*10)
    }
    println("*************Iteration*******************************************")
    val nameIt = list4.iterator
    while(nameIt.hasNext){
      println(nameIt.next())
    }

    println("************ ADD elements to List ***************")

  val name = List("SCALA","JAVA","SPARK","KAFKA","HIVE","MAPREDUCE")
    println("flatten names  "+name.flatten)
    println("map func names  "+name.map(ele => ele.toLowerCase))
    println("flatmap names  "+name.flatMap(ele => ele.toLowerCase))

    /**
      * scala> var name = List("SCALA","JAVA","SPARK","KAFKA","HIVE","MAPREDUCE")
name: List[String] = List(SCALA, JAVA, SPARK, KAFKA, HIVE, MAPREDUCE)

scala> name = "HDFS" :: name
name: List[String] = List(HDFS, SCALA, JAVA, SPARK, KAFKA, HIVE, MAPREDUCE)

scala> name(2) = "VEERA"
:13: error: value update is not a member of List[String]
       name(2) = "VEERA"
       ^

scala> name = name :: "VEERA"
:12: error: value :: is not a member of String
       name = name :: "VEERA"
                   ^

scala> val name = List("SCALA","JAVA","SPARK","KAFKA","HIVE","MAPREDUCE")
name: List[String] = List(SCALA, JAVA, SPARK, KAFKA, HIVE, MAPREDUCE)

scala> name = "HDFS" :: name
:12: error: reassignment to val
       name = "HDFS" :: name
            ^

scala> val name2 = "HDFS" :: name
name2: List[String] = List(HDFS, SCALA, JAVA, SPARK, KAFKA, HIVE, MAPREDUCE)

scala> var name = List("SCALA","JAVA","SPARK","KAFKA","HIVE","MAPREDUCE")
name: List[String] = List(SCALA, JAVA, SPARK, KAFKA, HIVE, MAPREDUCE)

scala> name = "HDFS" +: name
name: List[String] = List(HDFS, SCALA, JAVA, SPARK, KAFKA, HIVE, MAPREDUCE)

scala> name = name :+ "VEERA"
name: List[String] = List(HDFS, SCALA, JAVA, SPARK, KAFKA, HIVE, MAPREDUCE, VEERA)

scala> name = name ++ "VEERA"
:12: error: type mismatch;
 found   : List[Any]
 required: List[String]
       name = name ++ "VEERA"
                   ^

scala> name = name ++ List("VEERA")
name: List[String] = List(HDFS, SCALA, JAVA, SPARK, KAFKA, HIVE, MAPREDUCE, VEERA, VEERA)

scala> name = name ::: List("VEERA","RAVI")
name: List[String] = List(HDFS, SCALA, JAVA, SPARK, KAFKA, HIVE, MAPREDUCE, VEERA, VEERA, VEERA, RAVI)
scala> List(1,2,3) ::: List(4,5,6)
res18: List[Int] = List(1, 2, 3, 4, 5, 6)

scala> List(4,5,6).:::(List(1,2,3))
res0: List[Int] = List(1, 2, 3, 4, 5, 6)
      * */

println("*************************Converting List to string ******************")
    println(name.mkString(" "))
    println(name.mkString(","))
    println(name.mkString("\n"))

    Iterable
/*
    scala> name.mkString
    res8: String = HDFSSCALAJAVASPARKKAFKAHIVEMAPREDUCEVEERAVEERAVEERARAVI

    scala> name.mkString(" ")
    res9: String = HDFS SCALA JAVA SPARK KAFKA HIVE MAPREDUCE VEERA VEERA VEERA RAVI

    scala> name.mkString(",")
    res10: String = HDFS,SCALA,JAVA,SPARK,KAFKA,HIVE,MAPREDUCE,VEERA,VEERA,VEERA,RAVI

    scala> name.mkString("\n")
    res11: String =
    HDFS
    SCALA
    JAVA
    SPARK
    KAFKA
    HIVE
    MAPREDUCE
    VEERA
    VEERA
    VEERA
    RAVI

    scala> name.mkString("[",",","]")
res12: String = [HDFS,SCALA,JAVA,SPARK,KAFKA,HIVE,MAPREDUCE,VEERA,VEERA,VEERA,RAVI]

  scala> val colors = List("blue", "yellow", "red")
colors: List[String] = List(blue, yellow, red)

scala> val result = colors.toArray
result: Array[String] = Array(blue, yellow, red)

scala> name.mkString("["," ","]")
res13: String = [HDFS SCALA JAVA SPARK KAFKA HIVE MAPREDUCE VEERA VEERA VEERA RAVI]
    */
println("*************************Combination of diff datatypes***************")
val nums = List(1,10.0d,100,100.00f,15.toByte,10.toShort)

 /*
 * scala> val nums = List(1,10.0d,100,100.00f,15.toByte,10.toShort,1025469874563215489l)
nums: List[Double] = List(1.0, 10.0, 100.0, 100.0, 15.0, 10.0, 1.02546987456321549E18)

scala> val nums = List(1,100,100.00f,15.toByte,10.toShort,1025469874563215489l)
nums: List[Float] = List(1.0, 100.0, 100.0, 15.0, 10.0, 1.0254699E18)

scala> nums(2)
res3: Float = 100.0

scala> val nums = List(1,100,15.toByte,10.toShort,1025469874563215489l)
nums: List[Long] = List(1, 100, 15, 10, 1025469874563215489)

scala> val nums = List(1,100,15.toByte,10.toShort,1025469874563215489l,"VASAVI")
nums: List[Any] = List(1, 100, 15, 10, 1025469874563215489, VASAVI)

scala> val nums = List(1,100,15.toByte,10.toShort,1025469874563215489l,Some(1))
nums: List[Any] = List(1, 100, 15, 10, 1025469874563215489, Some(1))

scala> val nums = List(1,100,15.toByte,10.toShort,1025469874563215489l,None)
nums: List[Any] = List(1, 100, 15, 10, 1025469874563215489, None)

scala> val nums = List(1,100,15.toByte,10.toShort,1025469874563215489l,Nothing)
<console>:11: error: not found: value Nothing
       val nums = List(1,100,15.toByte,10.toShort,1025469874563215489l,Nothing)
 * */

  println("*************DELETION*******************************************")

    //filter
    println("Filter from list >2 "+list2.filter(ele => ele >2))
    println("Filter from list >2 "+list2.filter(_>2))
    var list5 = List(1,2,3,4,5)

    val lB = scala.collection.mutable.ListBuffer(1,2,3,4,5,6,7,8,9,10)
    println("List buffer "+lB)
    lB.remove(9)
    println("Afer remove List buffer "+lB)

    lB -=6
    println("Afer remove 6 List buffer "+lB)
    lB -=(1,4)
    println("Afer remove (1,4) List buffer "+lB)
    val rem = List(7,8,9)
    lB --= rem
    println("Afer remove List(7,8,9) List buffer "+lB)

    println("*************Higher Order Functions***************************")

    val list8 = list4:::list2;

    println(list8.distinct)
    println("Filter from list >2 "+list8.filter(ele => ele >2))
    println("Filter from list >2 "+list8.filter(_>2))

    val distList = list8.distinct

    println(distList.map(ele => ele+1))
    println(distList.map(ele => {
      if(ele%2==0) ele * 10 else ele
    }))

    val name1 = List("SCALA","JAVA","SPARK","KAFKA","HIVE","MAPREDUCE")
    println("flatten names  "+name1.flatten)
    println("map func names  "+name1.map(ele => ele.toLowerCase))
    println("flatmap names  "+name1.flatMap(ele => ele.toLowerCase))

    println("fold "+ distList.foldLeft(0)(_+_))

val l1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val l2 = List(2,4,6,8,10)
    println(l1.zip(l2))//List((1,2), (2,4), (3,6), (4,8), (5,10))
    println(l2.zip(l1))// List((2,1), (4,2), (6,3), (8,4), (10,5))

  }
}
