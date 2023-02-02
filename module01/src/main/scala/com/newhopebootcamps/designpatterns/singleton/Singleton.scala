package com.newhopebootcamps.designpatterns.singleton

class Singleton {
  println("created an instance.")
}

object Singleton {
  private val singleton = new Singleton
  def getInstance(): Singleton = {
    return singleton
  }
}
