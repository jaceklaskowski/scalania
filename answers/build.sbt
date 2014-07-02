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

testOptions in Test := Seq(
  Tests.Filter(s => 
  	!s.matches(".*algorithms.*") &&
  	s.matches(".*P0[1-3,6]Spec.*") ||
  	s.matches(".*P1[2-6]Spec.*") ||
  	s.matches(".*P2[0-2]Spec.*") ||
  	s.matches(".*P31Spec.*")
  )
)

instrumentSettings

coverallsSettings