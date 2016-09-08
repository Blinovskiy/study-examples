name := "study-examples"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= {
  Seq(
    "org.scala-lang" % "scala-reflect" % "2.11.8",
    "ch.qos.logback" % "logback-classic" % "1.1.3",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
    "org.scalacheck" %% "scalacheck" % "1.12.5"
  )
}