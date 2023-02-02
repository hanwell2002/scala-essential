package com.newhopebootcamps.designpatterns.singleton

object Logger {
  def debug(message: String): Unit = println(s"DEBUG: $message")
  def info(message: String): Unit = println(s"INFO: $message")
  def warn(message: String): Unit = println(s"WARN: $message")
  def error(message: String): Unit = println(s"ERROR: $message")


}