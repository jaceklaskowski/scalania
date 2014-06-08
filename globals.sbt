name in Global := "scalania"

version in Global := "0.1.0-SNAPSHOT"

scalaVersion in Global := "2.11.1"

libraryDependencies in Global += "org.specs2" %% "specs2" % "2.3.12" % "test"

resolvers in Global ++= Seq("snapshots", "releases") map Resolver.sonatypeRepo
