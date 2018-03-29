
name := s"${(name in Global).value}-${name.value}"

//scalastyleConfig := file("project/scalastyle-config.xml")
//scalastyleFailOnError := true

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

//scapegoatDisabledInspections := Seq("X")
//scapegoatEnabledInspections := Seq("ArraysToString")
//scapegoatIgnoredFiles := Seq("X")

