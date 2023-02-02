package com.newhopebootcamps.designpatterns.singleton
object Main {
  def main(args: Array[String]) {
    println("Start.")

    val obj1 = Singleton.getInstance()
    val obj2 = Singleton.getInstance()

    if ( obj1 == obj2 ) {
      println("obj1 and obj2 ARE the same instance.")
    }
    else {
      println("obj1 and obj2 are NOT the same instance.")
    }
    println("End.")
  }
}
