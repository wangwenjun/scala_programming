package com.wangwenjun.scala.chapter9

object CurryDemo extends App {

  def plainOldSum(x: Int, y: Int): Int = x + y

  println(plainOldSum(1, 2))

  def curriedSum(x: Int)(y: Int) = x + y

  println(curriedSum(1)(2))

  def first(x: Int): (Int) => Int = {
    (y: Int) => x + y
  }

  val second: (Int) => Int = first(10)

  println(second(12))

  val c2 = curriedSum(1) _
  println(c2(3))
}