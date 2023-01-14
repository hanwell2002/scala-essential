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
    def start: Unit = println("Process is starting")

    def stop: Unit = println("Process stopped")
  }

  val processId: Int = 5
  processId.start
  processId.stop
}