package com.scala.jsonParse



import net.liftweb.json.DefaultFormats
import net.liftweb.json._
import scala.collection.mutable.ArrayBuffer



object JsonTest2 {
  val sampleData = """{
     "Meta Data": {
         "1. Information": "Batch Stock Market Quotes",
         "2. Notes": "IEX Real-Time Price provided for free by IEX (https://iextrading.com/developer/).",
         "3. Time Zone": "US/Eastern"
     },
     "Stock Quotes": [
         {
             "1. symbol": "MSFT",
             "2. price": "91.6000",
             "3. volume": "23511825",
             "4. timestamp": "2018-01-22 16:00:00"
         },
         {
             "1. symbol": "FB",
             "2. price": "186.4000",
             "3. volume": "20946922",
             "4. timestamp": "2018-01-22 16:41:06"
         },
         {
             "1. symbol": "AAPL",
             "2. price": "176.8900",
             "3. volume": "27027474",
             "4. timestamp": "2018-01-22 16:00:00"
         }
     ]
 }"""
  case class Stock(symbol: String, price: String)
  def main(args: Array[String]) {
    val json = parse(sampleData)
    implicit val formats = DefaultFormats

    val elements = (json \\ "Stock Quotes").children

    val stocks = ArrayBuffer[Stock]()
    // keys are: "1. symbol", "2. price", "3. volume", "4. timestamp"
    // i expect 3 stocks, so ...
    for (i <- 0 until 3) {
      val e = elements(0)(i)
      // Map(1. symbol -> MSFT, 2. price -> 91.6000, 3. volume -> 23511825, 4. timestamp -> 2018-01-22...)
      val values = e.values.asInstanceOf[Map[String, String]] //coercion
      //        for ((k,v) <- values) printf("key: %s, value: %s\n", k, v)
      //        println("")
      stocks += Stock(values("1. symbol"), values("2. price"))
    }

    stocks.foreach(println)


  }

}