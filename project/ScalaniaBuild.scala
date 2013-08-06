import sbt._
import Keys._

object ScalaniaBuild extends Build {

  lazy val root =
    Project(id = "scalania",
            base = file(".")) aggregate (exercises, answers)
  lazy val exercises =
    Project(id = "exercises",
            base = file("exercises"))
  lazy val answers =
    Project(id = "answers",
            base = file("answers")) dependsOn(exercises % "test->test;compile->compile")
}
