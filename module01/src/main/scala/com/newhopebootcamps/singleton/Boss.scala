package com.newhopebootcamps.singleton

class Boss private() {
  var name: String = _
}


object Boss {
  private var b: Boss = null
  def getInstance = {
    if(b == null) {
      b = new Boss
    }
    b
  }
}

object Runner extends App {

  val boss1  = Boss.getInstance

  val boss2 = Boss.getInstance

  println(boss1)
  println(boss2)

  if(boss1.hashCode() == boss2.hashCode()) {
    println("Equals")
  }else
    println("Not equals")

}
