scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

scalacOptions in Test += "-Yrangepos"
scapegoatVersion := "1.1.0"

lazy val scalania = project.in(file(".")).aggregate(exercises).settings(
  publishArtifact := false
)

lazy val exercises = project

lazy val answers = project dependsOn (exercises % "test->test")

addCommandAlias("check", "; clean; update; test:update; project answers; scalastyle; coverage; test; coverageReport; coveralls")

scapegoatDisabledInspections := Seq("X")
scapegoatEnabledInspections := Seq("ArraysToString")
scapegoatIgnoredFiles := Seq("X")