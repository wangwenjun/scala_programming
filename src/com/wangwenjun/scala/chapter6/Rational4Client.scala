package com.wangwenjun.scala.chapter6

object Rational4Client extends App {

  val rational1: Rational4 = new Rational4
  val rational2: Rational4 = new Rational4(3)

  val result: Rational4 = rational1 add rational2
  println(result)

}
