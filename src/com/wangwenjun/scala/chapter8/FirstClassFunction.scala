package com.wangwenjun.scala.chapter8

object FirstClassFunction extends App {

  val increase = (x: Int) => x + 1

  println(increase(1))
  println(increase(2))
  println(increase(3))
  println("------------------------------")

  val arrs = Array(1, 2, 3, 4, 5, 6)
  val p = (x: Any) => println(x)

  arrs.foreach(p)
}
