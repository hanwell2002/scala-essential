package com.newhopebootcamps.oop


/* Super class Person */
class Person //base class, Student's parent class
{
  val first = "Adam"
  private val salary = 100000;
  def message() {
    println("This is person class");
  }

  def getSalary(): Unit = {
    salary
  }
}

/* Subclass Student */
class Student extends Person {
  override def message() {
    println("This is student class")
  }

  // Note that display() is only in Student class
  def display() {
    // will invoke or call current class message() method
    message()

    // will invoke or call parent class message() method
    super.message
  }

  def showName(): Unit = {
    println(first)

    println(getSalary)
  }
}

/* Creating School object */
object School extends App {
  var s = new Student();
  // Calling display() of Student
  s.display();
}