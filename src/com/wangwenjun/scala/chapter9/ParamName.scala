package com.wangwenjun.scala.chapter9

object ParamName extends App {

  def test(x: Int = 1, y: Int = 2) = x / y

  println(test(y = 20))
}