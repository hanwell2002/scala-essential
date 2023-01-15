package com.newhopebootcamps.implicits


/**
 * Implicit classes are just like implicit functions in the way that they are resolved.
 * Implicit class 用于扩展现有类的行为。
  隐式类在解析方式上就像隐式函数。
 */


/**
 * Implicit Class Example
 */
object Example05 extends App {
  implicit class Process(i: Int) {
    def start: Int = {
      println("Process is starting")

      println("The other process.")
      val processId = 5
      processId
    }

    def stop: Unit = println("Process stopped")
  }

  val processId: Int = 5

  println("ID:" +  processId.start)
  processId.stop

}

