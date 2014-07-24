inScope(Global) { Seq(
  organization := "pl.japila",
  name := "scalania",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.11.2",
  libraryDependencies ++= Seq(
    "org.specs2" %% "specs2" % "2.3.13" % Test,
    "org.scalacheck" %% "scalacheck" % "1.11.4" % Test,
    "org.scalatest" %% "scalatest" % "2.2.0" % Test
  ),
  resolvers ++= Seq("snapshots", "releases") map Resolver.sonatypeRepo,
  javaOptions += "-server"
)}
