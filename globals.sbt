inScope(Global) { Seq(
  organization := "pl.japila",
  name := "scalania",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.11.4",
  libraryDependencies ++= Seq(
    "org.specs2"     %% "specs2"     % "2.4.13" % Test,
    "org.scalatest"  %% "scalatest"  % "2.2.2"  % Test
  ),
  resolvers ++= Seq("snapshots", "releases") map Resolver.sonatypeRepo,
  javaOptions += "-server"
)}
