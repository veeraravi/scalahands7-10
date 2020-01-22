package com.scala.collections

object MapExample {
  def main(args: Array[String]): Unit = {

    val capitals = Map("AP" -> "AMARAVATHI","TS" -> "HYDERABAD","MH" ->"MUMBAI",
                       "KA" ->"MYSORE","AP" -> "HYDERABAD" )
    println("MAP "+capitals)

    val items = Map(("IDLY",15),("DOSA",25),("VADA",15),("UPMA",20),("BONDA",10))
    println(items)

    println("Price of idly "+items("IDLY"))
    println("get vada  "+items.getOrElse("VADA","key is not mached"))

    // default value for map
    val dMap = Map("Dannies Rich" -> "C","Stustuff" -> "C++",
                   "Gosling" -> "JAVA","Cutting" ->"HADOOP" ).withDefaultValue("He/she did not invent any s/w please check the key and case")
    println("MAP "+dMap.get("Gosling"))
    println("MAP "+dMap("veera"))

    //Traversing through map
    for((key,value) <- capitals) println(s"state: $key, capital: $value")
println("********** FOR EACH ******")
    capitals.foreach{
      case(key,value) =>println(s"state: $key, capital: $value")
    }

    items.foreach(ele => println(s"iteam ${ele._1}, price ${ele._2}"))

    println("******** ONLY KEYS ***********")
    capitals.keys.foreach(println)
    capitals.values.foreach(println)

   val ckeys= capitals.keysIterator
   val ckeysSet = capitals.keySet
   val cValues= capitals.values

    val reverseMap = for((k,v) <- capitals) yield (v,k)
    println("Reverse map "+reverseMap)

    if(capitals.contains("AP"))
      {

      }else{

      }
    if(capitals.valuesIterator.exists(ele => ele.contains("HYD")))
      {

      }
    capitals.filterKeys(ele => ele == "AP")
    println("********** ADD/Delete elements ******")
    /*
    scala> pairMap+=("A"->"APPLE")

scala> pairMap
   var pairMap: scala.collection.immutable.Map[String,String]

scala> pairMap
res32: scala.collection.immutable.Map[String,String] = Map(MH -> MUMBAI, A -> APPLE, KA -> MYSORE, AP -> AMARAVATHI, TS -> HYD)

scala> pairMap+=Map("A"->"APPLE","B"->"BALL")
<console>:13: error: value += is not a member of scala.collection.immutable.Map[String,String]
  Expression does not convert to assignment because:
    type mismatch;
     found   : scala.collection.immutable.Map[String,String]
     required: (String, String)
    expansion: pairMap = pairMap.+(Map("A".$minus$greater("APPLE"), "B".$minus$greater("BALL")))
       pairMap+=Map("A"->"APPLE","B"->"BALL")
              ^

scala> pairMap+=("A"->"APPLE","B"->"BALL")

scala> pairMap-=("A")

scala> pairMap
res36: scala.collection.immutable.Map[String,String] = Map(MH -> MUMBAI, B -> BALL, KA -> MYSORE, AP -> AMARAVATHI, TS -> HYD)

scala> pairMap-=("B","KA")

scala> pairMap
res38: scala.collection.immutable.Map[String,String] = Map(MH -> MUMBAI, AP -> AMARAVATHI, TS -> HYD)

scala> pairMap("AP")="VEERARAVI"
<console>:13: error: value update is not a member of scala.collection.immutable.Map[String,String]
       pairMap("AP")="VEERARAVI"
       ^
   scala> val reverseMap = for((k,v) <- capitals) yield (v,k)
reverseMap: scala.collection.immutable.Map[String,String] = Map(HYDERABAD -> TS, MUMBAI -> MH, MYSORE -> KA)

scala> capitals.ta
tail   tails   take   takeRight   takeWhile

scala> capitals.take(1)
res40: scala.collection.immutable.Map[String,String] = Map(AP -> HYDERABAD)

scala> capitals.fi
filter   filterKeys   filterNot   find

scala> capitals.head
head   headOption

scala> capitals.head
res41: (String, String) = (AP,HYDERABAD)

scala> capitals.tail
tail   tails

scala> capitals.tail
res42: scala.collection.immutable.Map[String,String] = Map(TS -> HYDERABAD, MH -> MUMBAI, KA -> MYSORE)

scala> capitals.
+              count            getOrElse            max                 scanRight      toMap
++             default          groupBy              maxBy               seq            toSeq
++:            drop             grouped              min                 size           toSet
-              dropRight        hasDefiniteSize      minBy               slice          toStream
--             dropWhile        hashCode             mkString            sliding        toString
/:             empty            head                 nonEmpty            span           toTraversable
:\             equals           headOption           orElse              splitAt        toVector
WithFilter     exists           init                 par                 stringPrefix   transform
addString      filter           inits                partition           sum            transpose
aggregate      filterKeys       isDefinedAt          product             tail           unzip
andThen        filterNot        isEmpty              reduce              tails          unzip3
apply          find             isTraversableAgain   reduceLeft          take           updated
applyOrElse    flatMap          iterator             reduceLeftOption    takeRight      values
canEqual       flatten          keySet               reduceOption        takeWhile      valuesIterator
collect        fold             keys                 reduceRight         to             view
collectFirst   foldLeft         keysIterator         reduceRightOption   toArray        withDefault
companion      foldRight        last                 repr                toBuffer       withDefaultValue
compose        forall           lastOption           runWith             toIndexedSeq   withFilter
contains       foreach          lift                 sameElements        toIterable     zip
copyToArray    genericBuilder   map                  scan                toIterator     zipAll
copyToBuffer   get              mapValues            scanLeft            toList         zipWithIndex


    * */

    //Properties
  }
}
