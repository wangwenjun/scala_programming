package com.wangwenjun.scala.chapter1

object EnhanceHelloScala {

  def main(args: Array[String]): Unit = {

    var map: Map[String, String] = Map("Hello" -> "World", "scala" -> "programming")

    map += ("foo" -> "fun")

  }
}
