import de.johoop.jacoco4sbt._
import JacocoPlugin._

name := "scalania-answers"

libraryDependencies in Global += "org.specs2" %% "specs2" % "2.3.1"

org.scalastyle.sbt.ScalastylePlugin.Settings

org.scalastyle.sbt.PluginKeys.config := file("project/scalastyle_config.xml")

scalariformSettings

jacoco.settings

scalaSource in Test := (scalaSource in LocalProject("exercises") in Test).value
