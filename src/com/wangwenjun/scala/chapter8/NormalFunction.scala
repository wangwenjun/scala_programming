package com.wangwenjun.scala.chapter8

object NormalFunction extends App {

  def processRange(x: Int, y: Int) = {
    val range: Range = x to y
    for (i <- range) process(i)
  }

  def process(x: Int) = {
    println(x)
  }

  processRange(1, 10)
}