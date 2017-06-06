package com.wangwenjun.scala.chapter6

object Rational3Client extends App {

  val rational1: Rational3 = new Rational3(1, 2)
  val rational2: Rational3 = new Rational3(1, 2)
  //val result = rational1.add(rational2)
  val result = rational1 add rational2

  println(result)
}
