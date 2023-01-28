package com.newhopebootcamps.oop

/* Base class Animal */
class Animal
{
  def eat
  {
    println("Animal is eating")
  }
  def run
  {
    println("Animal is running")
  }
}

/* Subclass Tiger */
class Tiger extends Animal
{
  // Note that readThanWrite() is only in Scala class
  def live()
  {
    // Will invoke or call parent class eat() method
    super.eat

    // Will invoke or call parent class run() method
    super.run
  }
  def hunt(): Unit = {
     println("Tiger is hunting a Goat.")
  }
}

// Creating object
object Zookeeper
{
  def main(args: Array[String])
  {
    var babyTiger = new Tiger();

    // Calling live() of Tiger
    babyTiger.live();
  }
}