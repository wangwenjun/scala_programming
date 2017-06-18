package com.wangwenjun.scala.highfunction

object Curry extends App {

  def mul(x: Int, y: Int) = x * y

  def mul2(x: Int): (Int) => Int = (y: Int) => x * y

  println(mul(2, 3))
  val mul2_1 = mul2(3)
  println(mul2_1(3))


  println(mul2(3)(5))

  def mul3(x: Int)(y: Int): Int = x * y

  println(mul3(1) _)

  /*
    def runInThread(block: () => Unit): Unit = {
      new Thread() {
        override def run(): Unit = {
          block
        }
      }.start()
    }*/

  def runInThread(block: => Unit) {
    new Thread() {
      override def run = block
    }.start()
  }

  /*
    runInThread(() => {
      println("Hi")
      Thread.sleep(1000)
      println("Bye")
    }
    )*/

  runInThread {
    println("Hi")
    Thread.sleep(1000)
    println("Bye")
  }

}
