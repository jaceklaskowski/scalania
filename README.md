## [Scalania](http://scalania.pl) - exercises to learn Scala

There's an idea to host regular Scala hackathons in Warsaw, Poland and the project is to let people get started code-wise. This is a sbt-based project with tests that are meant to help people learn Scala while solving problems as described in [S-99: Ninety-Nine Scala Problems](http://aperiodic.net/phil/scala/s-99/) and exercises that accompany a Scala course ["Scala i programowanie funkcyjne"](http://www.grzegorzbalcerek.net/scalafp.html.

The website of the event is http://scalania.pl (still in Polish).

### How to get started with the project
* Download [sbt](http://www.scala-sbt.org/)
* Run `sbt`

	$ sbt
	[info] Loading global plugins from /Users/jacek/.sbt/plugins
	[info] Loading project definition from /Users/jacek/oss/scalania/project
	[info] Set current project to scalania (in build file:/Users/jacek/oss/scalania/)

* Execute `~test` and make the tests pass (make them all green)

	> ~test
	[info] P01Spec
	[info] P01 should
	[info] + Find the last element of a list.
	[info] Total for specification P01Spec
	[info] Finished in 158 ms
	[info] 1 example, 0 failure, 0 error
	[info] Passed: : Total 1, Failed 0, Errors 0, Passed 1, Skipped 0
	[success] Total time: 9 s, completed Aug 3, 2013 1:45:23 PM
	1. Waiting for source changes... (press enter to interrupt)

* Once all the tests get green, you're done.

### Want to contribute?
Fork [the project](https://github.com/jaceklaskowski/scalania) and send pull requests on GitHub. Please use topic branches when sending pull requests rather than committing directly to master in order to minimize unnecessary merge commit clutter.

### Tools used
* http://www.scala-sbt.org/
* https://github.com/kobmic/plain-scala.g8
* http://aperiodic.net/phil/scala/s-99/
>>>>>>> P01 from S99
