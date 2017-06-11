package com.wangwenjun.scala.chapter8

object LocalFunction extends App {

  def processRange(x: Int, y: Int) = {
    def process(x: Int) = {
      println(x)
    }

    val range: Range = x to y
    for (i <- range) process(i)
  }

  processRange(1, 10)
}
