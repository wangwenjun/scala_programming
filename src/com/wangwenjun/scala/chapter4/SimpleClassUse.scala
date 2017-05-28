package com.wangwenjun.scala.chapter4

object SimpleClassUse extends App {

  var clazz1: SimpleClass = new SimpleClass()
  var clazz2: SimpleClass = new SimpleClass
  println(clazz1.hashCode)
  println(clazz2 hashCode)

  clazz1.add(1)
  clazz1.add(2)
  clazz1.add(3)
  println(clazz1 getSum)
  println(clazz2 getSum)

  import SimpleClass._

  val clazz3: SimpleClass = SimpleClass()
  clazz3.add(1)
  clazz3.add(2)
  clazz3 add 4
  println(clazz3 getSum)
}