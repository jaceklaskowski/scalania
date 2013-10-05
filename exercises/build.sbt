import de.johoop.jacoco4sbt._
import JacocoPlugin._

name := "scalania-exercises"

org.scalastyle.sbt.ScalastylePlugin.Settings

org.scalastyle.sbt.PluginKeys.config := file("project/scalastyle_config.xml")

scalariformSettings

jacoco.settings
