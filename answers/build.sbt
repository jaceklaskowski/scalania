import de.johoop.jacoco4sbt._
import JacocoPlugin._

name := "scalania-answers"

libraryDependencies in Global += "org.specs2" %% "specs2" % "2.4-SNAPSHOT"

resolvers += "Sonatype Snapshots Nexus" at "https://oss.sonatype.org/content/repositories/snapshots"

org.scalastyle.sbt.ScalastylePlugin.Settings

org.scalastyle.sbt.PluginKeys.config := file("project/scalastyle_config.xml")

scalariformSettings

jacoco.settings

scalaSource in Test := (scalaSource in LocalProject("exercises") in Test).value
