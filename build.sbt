name := "scalania"

organization := "pl.japila"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

scalacOptions in Test ++= Seq("-Yrangepos")

lazy val scalania = project in file(".") aggregate exercises

lazy val exercises = project

lazy val answers = project dependsOn (exercises % "test->test")
