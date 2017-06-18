package com.wangwenjun.scala.chapter12

class ConsoleLogger extends Logger {

  override def log(msg: String): Unit = {
    println(msg)
  }
}
