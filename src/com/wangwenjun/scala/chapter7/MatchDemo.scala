package com.wangwenjun.scala.chapter7

object MatchDemo extends App {

  var a: String = _
  a match {
    case "Alex" => println("11111111111")
    case "Tinner" => println("2222222222")
    case _ => println("default")
  }
}
