package com.wangwenjun.scala.chapter3

object TupleDemo extends App {

  val pair = (99, "Hello")

  println(pair._1)
  println(pair._2)

  val pair2 = Tuple2("1", 3)
}
