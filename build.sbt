name := "scalania"

organization := "pl.japila"

version in Global := "0.1.0-SNAPSHOT"

scalaVersion in Global := "2.10.3"

scalacOptions ++= Seq( "-deprecation", "-unchecked", "-feature")

scalacOptions in Test ++= Seq("-Yrangepos")

libraryDependencies in Global += "org.specs2" %% "specs2" % "2.2.3" % "test"

resolvers in Global ++= Seq(
  "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases"  at "http://oss.sonatype.org/content/repositories/releases")

lazy val scalania = project.in(file(".")).aggregate(exercises)

lazy val exercises = project

lazy val answers = 
  project.dependsOn(exercises % "test->test")
