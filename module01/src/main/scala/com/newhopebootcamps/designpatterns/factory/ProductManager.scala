package com.newhopebootcamps.designpatterns.factory


import com.newhopebootcamps.designpatterns.singleton.Logger
import com.newhopebootcamps.designpatterns.singleton.Logger.{info, error}
object ProductManager extends App {

  Logger.debug("this is info")
  info("this is info")
  error("this is error message")



}
