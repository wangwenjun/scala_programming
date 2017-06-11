package com.wangwenjun.scala.chapter8

/**
  * 只要每个参数在函数字面量中仅出现一次，就可以用_代替
  *
  */
object PlaceHolderDemo extends App {

  val arrs = Array(1, 2, 3, 4, 5, 6)

  arrs.filter(_ % 2 == 0).foreach(println _)

  //val f = (x: Int, y: Int) => x + y
  //val f = _+_

  //val f = x + y

  val f = (_: Int) + (_: Int)

  println(f(1, 2))
}