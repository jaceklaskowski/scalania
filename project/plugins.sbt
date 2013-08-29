resolvers += Classpaths.typesafeResolver

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.2.0")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.1")

// http://www.scalastyle.org/sbt.html
// addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.3.2")