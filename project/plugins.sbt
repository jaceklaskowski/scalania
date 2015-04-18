libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value

resolvers += Classpaths.typesafeReleases

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")

scalacOptions += "-deprecation"
