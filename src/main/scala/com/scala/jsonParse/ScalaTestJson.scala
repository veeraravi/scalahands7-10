package com.scala.jsonParse

import net.liftweb.json.{DefaultFormats, _}
import net.liftweb.json.Serialization.write

import scala.collection.mutable
/**
  * A case class to match the json properties.
  */


case class Products( id: String,
                     interest: String)

case class UpdatedProducts( id: String,
                     interest: String,
                            name:String)
object ScalaTestJson {

  implicit val formats = DefaultFormats

  val rec1: String =
    """{
    "visitorId": "v1",
    "products": [{
         "id": "i1",
         "interest": 0.68
    }, {
         "id": "i2",
         "interest": 0.42
    }]
}"""

  val rec2: String =
    """{
    "visitorId": "v2",
    "products": [{
         "id": "i1",
         "interest": 0.78
    }, {
         "id": "i3",
         "interest": 0.11
    }]
}"""

  val visitsData: Seq[String] = Seq(rec1, rec2)

  val productIdToNameMap = Map("i1" -> "Nike Shoes", "i2" -> "Umbrella", "i3" -> "Jeans")

  def main(args: Array[String]) {
    val productIdToNameMap = Map("i1" -> "Nike Shoes", "i2" -> "Umbrella", "i3" -> "Jeans")
    val prods = mutable.MutableList[Products]()
    val p = visitsData.map(ele => {
      val json = parse(ele)
      val tokens = for {
        tokenList <- (json \\ "products").children
        JArray(subTokenList) <- tokenList
        liftToken <- subTokenList
        token = liftToken.extract[Products]
        //  prods += Products(token.id,token.interest)
      } yield token
      //  println(tokens)
      tokens
    })
    println(p)
    val flatmap = p.flatten
    flatmap.map(ele => {
      if (productIdToNameMap.contains(ele.id)) {
        val p = UpdatedProducts(ele.id, ele.interest, productIdToNameMap(ele.id))
        val jsonString = write(p)
        println(jsonString)
      }
    })
  }
}