package com.wangwenjun.scala.chapter3


object MapDemo extends App {

  import scala.collection.mutable.Map

  val map: Map[Int, String] = Map[Int, String]()
  map += (1 -> "Hello")
  map += (2 -> "World")
  map += (3 -> "Scala")

  println(map)
  private val keys: Iterable[Int] = map.keys
  keys.foreach(k => println(k + "=" + map.get(k).get))

  println("==========================")
  for (k <- keys) {
    println(k + "=" + map.get(k).get)
  }
}
