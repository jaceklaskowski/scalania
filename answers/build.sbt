import de.johoop.jacoco4sbt._
import JacocoPlugin.jacoco.{settings => jacocoSettings}
import org.scalastyle.sbt.PluginKeys
import org.scalastyle.sbt.ScalastylePlugin.{Settings => scalastyleSettings}

name := s"${(name in Global).value}-answers"

scalastyleSettings

org.scalastyle.sbt.PluginKeys.config := file("project/scalastyle_config.xml")

scalariformSettings

jacocoSettings

scalaSource in Test := (scalaSource in LocalProject("exercises") in Test).value
