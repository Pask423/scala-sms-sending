name := "sms-sending"

scalaVersion := "2.13.5"

organization := "pask-software"

version := "1.1"

libraryDependencies ++= Seq(
  "com.vonage" % "client" % "6.2.0",
  "com.typesafe" % "config" % "1.4.1"
)
