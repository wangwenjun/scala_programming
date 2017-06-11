package com.wangwenjun.scala.chapter7

object WhileDemo extends App {

  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }

    b
  }

  println(gcdLoop(2, 4))

  def greeting(): String = {
    "Hello"
  }

  var line = ""

  val a = line = greeting

  println(line)
  println(a)
}
