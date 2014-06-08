import de.johoop.jacoco4sbt._
import JacocoPlugin.jacoco.{settings => jacocoSettings}
import org.scalastyle.sbt.PluginKeys
import org.scalastyle.sbt.ScalastylePlugin.{Settings => scalastyleSettings}

name := s"${(name in Global).value}-exercises"

scalastyleSettings

PluginKeys.config := file("project/scalastyle_config.xml")

scalariformSettings

jacocoSettings
