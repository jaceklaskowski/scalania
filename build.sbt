name := "scalania"

organization := "pl.japila"

version in Global := "0.1.0-SNAPSHOT"

scalaVersion in Global := "2.10.3"

scalacOptions ++= Seq( "-deprecation", "-unchecked", "-feature")

scalacOptions in Test ++= Seq("-Yrangepos")

libraryDependencies in Global ++= Seq(
  "junit" % "junit" % "4.11" % "test",
  "org.scalatest" %% "scalatest" % "2.0.RC1-SNAP6" % "test",
  "org.specs2" %% "specs2" % "2.2.2" % "test"
)

resolvers in Global ++= Seq(
  "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases"  at "http://oss.sonatype.org/content/repositories/releases")

lazy val exercises = project

lazy val answers = 
  project.dependsOn(exercises % "test->test;compile->compile")
