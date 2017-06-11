package com.wangwenjun.scala.chapter8

object LiteralFunction extends App {

  val arrs = Array(1, 2, 3, 4, 5, 6)

  val result = arrs.filter(x => x % 2 == 0)

  result.foreach(x => println(x))
}