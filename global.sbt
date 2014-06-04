version in Global := "0.1.0-SNAPSHOT"

scalaVersion in Global := "2.11.0"

libraryDependencies in Global += "org.specs2" %% "specs2" % "2.3.11" % "test"

libraryDependencies in Global += "org.scalatest" % "scalatest_2.11" % "2.1.7" % "test"

resolvers in Global ++= Seq("snapshots", "releases") map Resolver.sonatypeRepo

javaOptions in Global ++= Seq("-server")