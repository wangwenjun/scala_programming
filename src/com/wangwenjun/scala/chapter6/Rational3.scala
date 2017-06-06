package com.wangwenjun.scala.chapter6

/**
  * define the simple class and write the function.
  *
  * @param n
  * @param d
  */
class Rational3(val n: Int, val d: Int) {
  require(d != 0, "The d not allowed zero.")

  override def toString(): String = {
    s"$n/$d"
  }

  def add(that: Rational3): Rational3 = {
    new Rational3(n * that.d + that.n * d, d * that.d)
  }
}