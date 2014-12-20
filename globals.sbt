val specsVer     = "2.4.15"
val scalatestVer = "2.2.3"

inScope(Global) { Seq(
  organization := "pl.japila",
  name := "scalania",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.11.4",
  libraryDependencies ++= Seq(
    "org.specs2"     %% "specs2-core"       % specsVer     % Test,
    "org.specs2"     %% "specs2-junit"      % specsVer     % Test,
    "org.specs2"     %% "specs2-scalacheck" % specsVer     % Test,
    "org.scalatest"  %% "scalatest"         % scalatestVer % Test
  ),
  resolvers ++= Seq("snapshots", "releases") map Resolver.sonatypeRepo,
  javaOptions += "-server"
)}
