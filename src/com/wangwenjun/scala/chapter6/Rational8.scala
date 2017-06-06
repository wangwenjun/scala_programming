package com.wangwenjun.scala.chapter6

class Rational8(var n: Int, var d: Int) {
  require(d != 0, "The d not allowed zero.")

  private val g = gcd(n.abs, d.abs)

  n = n / g
  d = d / g

  def this() = this(1, 1)

  def this(n: Int) = this(n, 1)

  override def toString(): String = {
    s"$n/$d"
  }

  def add(that: Rational8): Rational8 = {
    new Rational8(n * that.d + that.n * d, d * that.d)
  }

  def +(that: Rational8): Rational8 = {
    this.add(that)
  }

  def +(n: Int): Rational8 = {
    new Rational8(this.n + n * this.d, this.d)
  }

  def *(that: Rational8): Rational8 = {
    new Rational8(this.n * that.n, that.d * this.d)
  }

  private def gcd(x: Int, y: Int): Int = {
    if (y == 0) x else gcd(y, x % y)
  }

  //implicit def intToRational8(x: Int): Rational8 = new Rational8(x)
}