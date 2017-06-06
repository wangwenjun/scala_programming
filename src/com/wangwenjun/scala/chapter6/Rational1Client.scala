package com.wangwenjun.scala.chapter6

object Rational1Client extends App {
  val rational1: Rational1 = new Rational1(1, 2)
  println(rational1)

  println(rational1.d)
  println(rational1.n)
  rational1.d = 10

  rational1.getClass.getDeclaredMethods.foreach(println _)
}
