package com.wangwenjun.scala.chapter12

object Test extends Logger with Serializable {
  override def log(msg: String): Unit = {}
}