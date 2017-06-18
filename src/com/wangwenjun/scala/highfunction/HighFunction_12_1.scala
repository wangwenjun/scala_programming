package com.wangwenjun.scala.highfunction

object HighFunction_12_1 extends App {

  val num: Double = 3.14
  val fun: (Double) => Double = scala.math.ceil _

  println(fun(num))

  println(Array(3.14, 1.42, 2.0).map(fun))


  Array(3.14, 1.23, -34.1).map((x: Double) => scala.math.sin(x)).foreach((x: Double) => println(x))


  val sin = (x: Double) => scala.math.sin(x)
  val print = (x: Double) => println(x)

  def test(x: Int, f: (Int) => Int): Int = {
    println(x)
    val result = f(x)
    println(result)
    result
  }

  val double = (x: Int) => 2 * x

  println(test(10, double))
  println(test(10, _ * 2))


  def x(f: Double): (Double) => Double = {
    (xx: Double) => f * xx
  }

  val x1 = x(1)
  println(x1(10))
  println("*" * 10)


  1.to(10).map("*" * _).foreach(println)
}