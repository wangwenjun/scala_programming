package com.wangwenjun.scala.chapter2

object DefineFunction extends App {


  /**
    * [private|protected] def name(param:Type....)[:Return Type]={}
    *
    * @param x
    * @param y
    * @return
    */
  def max(x: Int, y: Int): Int = {
    if (x > y) return x
    else return y
  }

  def max2(x: Int, y: Int) = if (x > y) x else y

  println(max(1, 2))
  println(max2(1, 2))
}
