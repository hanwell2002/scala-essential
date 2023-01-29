package com.newhopebootcamps.singleton

class Boss2 private() {
  var name: String = _

  var age: Int = _

  println("Style2")

}


object Boss2 {

  private val b: Boss2 = new Boss2
  def getInstance2 = {
    b
  }
}

object TestBoss2 extends App {

  val boss1 = Boss2.getInstance2

  val boss2 = Boss2.getInstance2

  println(boss1)
  println(boss2)

}