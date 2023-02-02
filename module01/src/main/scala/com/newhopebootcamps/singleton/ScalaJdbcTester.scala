package com.newhopebootcamps.singleton

import java.sql.{DriverManager, ResultSet}

object ScalaJdbcTester extends App {

  // Get connection from SingletonConnection
  val conn = ScalaSingletonConnection.getConnection

  // Access db through the conn
  try {
    val stm = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
    val rs = stm.executeQuery("SELECT * from city")
    while (rs.next) {
      // println(rs.getString("name"))  //index 2
      println("" + rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3))
    }
  } finally {
     // conn.close()
  }


  val conn2 = ScalaSingletonConnection.getConnection

  // Access db through the conn
  try {
    val stm = conn2.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
    val rs = stm.executeQuery("SELECT * from country")
    while (rs.next) {
       println(rs.getString("name"))  //index 2
    }
  } finally {
    // conn2.close()
  }


}
