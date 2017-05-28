package com.wangwenjun.scala.chapter3

object ArrayDemo {

  def main(args: Array[String]): Unit = {
    defineAndPrintArray()
    invoke("Hello World")
    simpleDefineAndComplexUse()
  }

  def defineAndPrintArray(): Unit = {
    println("================defineAndPrintArray()")
    val arr: Array[String] = new Array[String](3)
    arr(0) = "Hello"
    arr(1) = " "
    arr(2) = "World\n"

    for (i <- 0 to arr.length - 1)
      print(arr(i))
  }

  def simpleDefineAndComplexUse(): Unit = {
    println("================simpleDefineAndComplexUse()")
    val arr = new Array[Int](4)
    for (i <- 0 to arr.length - 1){
      arr.update(i, i + 1)
    }

    for (j <- 0 until arr.length)
      println(arr.apply(j))
  }

  def invoke(msg: String): Unit = {
    println("================invoke()")
    val simple: Simple = new Simple
    simple invoke msg
  }
}