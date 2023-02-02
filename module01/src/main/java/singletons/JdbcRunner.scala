package singletons

import java.sql.{DriverManager, ResultSet}

object JdbcRunner extends App {

  // SingletonConnection.getInstance
  //  val driver = "org.postgresql.Driver"
  //  val con_str = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=Admin@777"
  //  /* Class.forName(driver) */
  // val conn = DriverManager.getConnection(con_str)

  // Get connection from SingletonConnection
  val conn = SingletonConnection.getInstance.getConnection

  // Access db through the conn
  try {
    val stm = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
    val rs = stm.executeQuery("SELECT * from city")
    while (rs.next) {
      // println(rs.getString("name"))  //index 2
      println("" + rs.getInt(1) + ", " + rs.getString(2) + ", "  + rs.getString(3))
    }
  } finally {
    conn.close()
  }


}
