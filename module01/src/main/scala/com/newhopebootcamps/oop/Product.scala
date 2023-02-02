package com.newhopebootcamps.oop

case class Product (name: String, price: Double)

class Order (code: Int){

  val products = List.empty

  val orderNumber = code


  def addToCart(item: Product): Unit = {

    products = products :+ item
  }
}

object Shopping extends App {


}


val watch = Product("Watch", 499.0)
val pc = Product("Lenovo", 1499.0)
val keyboard = Product("Cherry", 399.0)

