package com.wangwenjun.scala.chapter6

/**
  * Define the simple rational class and override the tostring method
  * @param n
  * @param d
  */
class Rational2(n: Int, d: Int) {
  require(d != 0, "The d not allowed zero.")

  println(s"Created $n/$d")

  override def toString(): String = {
    s"$n/$d"
  }
}