package com.scala.jsonParse

import net.liftweb.json.DefaultFormats
import net.liftweb.json._

object SarahScalaLiftJsonTest {

  implicit val formats = DefaultFormats

  val mailAccountString ="""
{
  "accounts": [
  { "emailAccount": {
    "accountName": "YMail",
    "username": "USERNAME",
    "password": "PASSWORD",
    "url": "imap.yahoo.com",
    "minutesBetweenChecks": 1,
    "usersOfInterest": ["barney", "betty", "wilma"]
  }},
  { "emailAccount": {
    "accountName": "Gmail",
    "username": "USER",
    "password": "PASS",
    "url": "imap.gmail.com",
    "minutesBetweenChecks": 1,
    "usersOfInterest": ["pebbles", "bam-bam"]
  }}
  ]
}
"""

  def main(args: Array[String]) {
    val json = parse(mailAccountString)
    val elements = (json \\ "emailAccount").children
    println("**** "+elements.foreach(println))
    for ( acct <- elements ) {
      val m = acct.extract[EmailAccount]
      println(m.url)
      println(m.username)
      println(m.password)
      m.usersOfInterest.foreach(println)
    }
  }

}

/**
  * A case class to match the json properties.
  */
case class EmailAccount(
                         accountName: String,
                         url: String,
                         username: String,
                         password: String,
                         minutesBetweenChecks: Int,
                         usersOfInterest: List[String]
                       )