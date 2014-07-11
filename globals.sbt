organization in Global := "pl.japila"

name in Global := "scalania"

version in Global := "0.1.0-SNAPSHOT"

scalaVersion in Global := "2.11.1"

libraryDependencies in Global ++= Seq(
  "org.specs2" %% "specs2" % "2.3.13" % Test,
  "org.scalacheck" %% "scalacheck" % "1.11.4" % Test
)

resolvers in Global ++= Seq("snapshots", "releases") map Resolver.sonatypeRepo
