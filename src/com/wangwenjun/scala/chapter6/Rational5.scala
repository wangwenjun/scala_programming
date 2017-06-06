package com.wangwenjun.scala.chapter6

class Rational5(var n: Int, var d: Int) {
  require(d != 0, "The d not allowed zero.")

  private val g = gcd(n.abs, d.abs)

  n = n / g
  d = d / g

  def this() = this(1, 1)

  def this(n: Int) = this(n, 1)

  override def toString(): String = {
    s"$n/$d"
  }

  def add(that: Rational5): Rational5 = {
    new Rational5(n * that.d + that.n * d, d * that.d)
  }

  private def gcd(x: Int, y: Int): Int = {
    if (y == 0) x else gcd(y, x % y)
  }
}
