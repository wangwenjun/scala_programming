package com.wangwenjun.scala.chapter8

object PartitalFunctionDemo extends App {


  def sum(a: Int, b: Int, c: Int) = a + b + c

  val sum3 = sum _

  println(sum3(1, 2, 3))

  println(sum3.apply(1, 2, 3))

  val sum2 = sum(1, _: Int, _: Int)

  println(sum2(2, 3))

  println(sum2.apply(2, 3))
}