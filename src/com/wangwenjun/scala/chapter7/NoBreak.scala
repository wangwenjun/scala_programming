package com.wangwenjun.scala.chapter7

object NoBreak extends App {

  val v: Array[Int] = Array(1, 2, 3, 4, 5, 6)

  def findIndex(x: Int): Boolean = {
    var i: Int = 0
    var find: Boolean = false
    while ((i < v.length - 1) && !find) {
      if (x == v(i)) {
        find = true
      }
      i += 1
    }
    find
  }

  println(findIndex(3))
}