
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

enablePlugins(AssemblyPlugin)

lazy val root = (project in file("."))
  .settings(
    name := "xml-processor",
    assembly / mainClass := Some("xml.Main"),
  )

lazy val _postgresJDBCVersion = "42.5.1"
lazy val _scalaCSVVersion = "1.3.10"
lazy val _scalaXMLVersion =  "2.1.0"

libraryDependencies ++= Seq(
  "com.oracle.database.jdbc" % "ojdbc8" % "21.3.0.0",
  "org.postgresql" % "postgresql" % _postgresJDBCVersion,
  "com.github.tototoshi" %% "scala-csv" % _scalaCSVVersion,
  "org.scala-lang.modules" %% "scala-xml" % _scalaXMLVersion,
)