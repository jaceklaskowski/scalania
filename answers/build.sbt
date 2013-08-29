name := "scalania-answers"

// org.scalastyle.sbt.ScalastylePlugin.Settings

// org.scalastyle.sbt.PluginKeys.config := file("project/scalastyle_config.xml")

scalaSource in Test <<= (scalaSource in Test in exercises)
