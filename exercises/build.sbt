import de.johoop.jacoco4sbt._
import JacocoPlugin.jacoco.{settings => jacocoSettings}

name := s"${(name in Global).value}-${name.value}"

scalastyleConfig := file("project/scalastyle_config.xml")
scalastyleFailOnError := true

scalariformSettings

jacocoSettings

scapegoatDisabledInspections := Seq("X")
scapegoatEnabledInspections := Seq("ArraysToString")
scapegoatIgnoredFiles := Seq("X")
