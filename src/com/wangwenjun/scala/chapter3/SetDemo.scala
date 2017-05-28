package com.wangwenjun.scala.chapter3


object SetDemo extends App {

  var set: Set[Int] = Set(1, 2, 3, 4, 4)

  println(set.size)
  set.foreach(println)
  set += 5

  println(set)
}
