package com.newhopebootcamps.designpatterns.factory

trait Car {
  def manufacture: String
  def model: String
}

class RedFlag(val id: String) extends Car {
  def manufacture = "FAW"
  def model = "RedFlag"
}

class Song(val id: String) extends Car {
  def manufacture = "BYD"
  def model = "Song"
}

object CarFactory {
  def create(manufacture: String) = manufacture match {
    case "FAW" => new RedFlag("FAW-" + System.currentTimeMillis())
    case "BYD" => new Song("BYD-" + System.currentTimeMillis())
  }
}