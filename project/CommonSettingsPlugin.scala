import sbt._
import Keys._

object CommonSettingsPlugin extends AutoPlugin {
  override def trigger = allRequirements
  override lazy val projectSettings = Seq(
    organization        := "pl.japila",
    version             := "0.1.0-SNAPSHOT",
    scalaVersion        := Version.scala,
    libraryDependencies := Dependencies.libraries,
    javaOptions         += "-server",
    resolvers           ++= Seq("snapshots", "releases") map Resolver.sonatypeRepo
  )

  override def globalSettings: Seq[Def.Setting[_]] = Seq(
    name := "scalania"
  )
}