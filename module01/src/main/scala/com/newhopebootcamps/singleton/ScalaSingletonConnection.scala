package com.newhopebootcamps.singleton

import java.io.IOException
import java.sql.{Connection, DriverManager, ResultSet, SQLException}

object ScalaSingletonConnection {
  private var connection: Connection = null
  private val url = "jdbc:postgresql://localhost:5432/postgres"
  private val username = "postgres"
  private val password = "Admin@777"

  def getConnection: Connection = {
    try {
      //Class.forName("org.postgresql.Driver");
      this.connection = DriverManager.getConnection(url, username, password);

      connection
    } catch {
        case e: SQLException =>  {
            println("DB connection failed")
            null
        }
        case _: Throwable => {
          println("Got some other kind of Throwable exception")
          null
        }

    } finally {
      println("Connecting to database!")
    }
  }

  /*  @throws[SQLException]
    def getInstance: ScalaSingletonConnection = {
      if (instance == null)
            instance = new ScalaSingletonConnection
      else if (instance.getConnection.isClosed)
            instance = new ScalaSingletonConnection

      instance
    }*/

}
