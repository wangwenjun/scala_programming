package com.wangwenjun.scala.chapter6

/**
  * define the simple class and override the construction.
  *
  * @param n
  * @param d
  */
class Rational4(val n: Int, val d: Int) {
  require(d != 0, "The d not allowed zero.")

  def this() = this(1, 1)

  def this(n: Int) = this(n, 1)

  override def toString(): String = {
    s"$n/$d"
  }

  def add(that: Rational4): Rational4 = {
    new Rational4(n * that.d + that.n * d, d * that.d)
  }
}
