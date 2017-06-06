package com.wangwenjun.scala.chapter6

object Rational8Client extends App {

  implicit def test(x: Int): Rational8 = new Rational8(x)

  val r = new Rational8(1, 2)
  println(r + 1)

  println(1 + r)
}
