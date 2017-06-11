package com.wangwenjun.scala.chapter7

object ClosureDemo extends App {

  var i: Int = 1
  val addI = (x: Int) => i + x


  println(addI(10))

  val array: Array[Int] = Array(1, 2, 3, 4)

  var sum: Int = 0

  array.foreach(sum += _)

  def increase(x: Int) = (y: Int) => x + y

  val inc1: (Int) => Int = increase(10)
  println(inc1)
  println(addI)

  val value: Int = inc1(1)

  println(value)
}