package com.wangwenjun.scala.chapter1

object HelloClassClient {

  def main(args:Array[String])={
    val hello:HelloClass=new HelloClass("Alex",32)
    println(hello)
  }
}
