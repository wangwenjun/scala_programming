package com.wangwenjun.scala.chapter4

class SimpleClass {
  private var sum: Int = 0

  def add(value: Int): Unit = {
    sum += value
  }

  def getSum(): Int = sum
}

object SimpleClass {

  def SimpleClass(): SimpleClass = new SimpleClass
}
