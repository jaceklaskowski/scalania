scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

scalacOptions in Test += "-Yrangepos"

lazy val scalania = project.in(file(".")).aggregate(exercises).settings(
  publishArtifact := false
)

lazy val exercises = project

lazy val answers = project dependsOn (exercises % "test->test")

addCommandAlias("check", "; clean; update; test:update; answers/scalastyle; project answers; coverage; test; coverageReport; coveralls")
