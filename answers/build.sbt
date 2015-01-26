import de.johoop.jacoco4sbt._
import JacocoPlugin.jacoco.{settings => jacocoSettings}

name := s"${(name in Global).value}-answers"

scalastyleConfig := file("project/scalastyle_config.xml")
scalastyleFailOnError := true

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

scapegoatDisabledInspections := Seq("X")
scapegoatEnabledInspections := Seq("ArraysToString")
scapegoatIgnoredFiles := Seq("X")

