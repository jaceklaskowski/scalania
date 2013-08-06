name := "scalania"

organization in ThisBuild := "pl.japila"

version := "0.1.0-SNAPSHOT"

scalaVersion in ThisBuild := "2.10.2"

scalacOptions in ThisBuild ++= Seq("-deprecation", "-feature")

libraryDependencies in ThisBuild ++= Seq(
  "junit" % "junit" % "4.11" % "test",
  "org.specs2" %% "specs2" % "2.1.1" % "test",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)
