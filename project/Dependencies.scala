import sbt._

object Version {
  val scala     = "2.11.6"
  val scalaTest = "2.2.4"
  val specs2    = "2.4.5"
}

object Library {
  val specs2Core       = "org.specs2"    %% "specs2-core"       % Version.specs2
  val specs2Junit      = "org.specs2"    %% "specs2-junit"      % Version.specs2
  val specs2ScalaCheck = "org.specs2"    %% "specs2-scalacheck" % Version.specs2
  val scalaTest        = "org.scalatest" %% "scalatest"         % Version.scalaTest
}

object Dependencies {

  import Library._

  val libraries = Seq(specs2Core, specs2Junit, specs2ScalaCheck, scalaTest).map(_ % Test)
}
