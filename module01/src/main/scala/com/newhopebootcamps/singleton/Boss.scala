package com.newhopebootcamps.singleton

//Lazy Instantiation
object Boss {

  //object is not instantiated
  private var b: Boss = null

  def getInstance = {
    if (b == null) {
      b = new Boss
    }
    b
  }

}

class Boss private() {
  var name: String = "Jobs"
}

object Runner extends App {

  val boss1 = Boss.getInstance
  val boss2 = Boss.getInstance

  println(boss1)
  println(boss2)

  if (boss1.hashCode() == boss2.hashCode()) {
    println("Equals")
    println(boss1.name)
  } else
    println("Not equals")

}
