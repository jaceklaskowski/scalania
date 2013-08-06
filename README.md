## [Scalania](http://scalania.pl) - exercises to learn Scala

There's an idea to host regular [Scala](http://scala-lang.org) hackathons in Warsaw, Poland and the project is to let people get started code-wise.

This is a [sbt](http://www.scala-sbt.org/)-based project with tests that are meant to help people learn Scala while solving problems as described in [S-99: Ninety-Nine Scala Problems](http://aperiodic.net/phil/scala/s-99/) and do the exercises that accompany a Scala course [Scala i programowanie funkcyjne](http://www.grzegorzbalcerek.net/scalafp.html).

The website of the event is http://scalania.pl.

### How to get started with the project
* Download [sbt](http://www.scala-sbt.org/).
* Run `sbt 'project exercises' ~test`

        $ sbt 'project exercises' ~test
        [info] Loading global plugins from /Users/jacek/.sbt/plugins
        [info] Loading project definition from /Users/jacek/oss/scalania/project
        [info] Set current project to scalania (in build file:/Users/jacek/oss/scalania/)
        [info] Set current project to exercises (in build file:/Users/jacek/oss/scalania/)
        [info] Updating {file:/Users/jacek/oss/scalania/}exercises...
        [info] Resolving org.scala-lang#scala-reflect;2.10.0 ...
        [info] Done updating.
        [info] Compiling 3 Scala sources to /Users/jacek/oss/scalania/exercises/target/scala-2.10/classes...
        [info] Compiling 3 Scala sources to /Users/jacek/oss/scalania/exercises/target/scala-2.10/test-classes...
        [info] P03Spec
        [info] P03 should
        [info] x Find the Kth element of a list
        [error]    an implementation is missing (P03.scala:4)
        [info] Total for specification P03Spec
        [info] Finished in 32 ms
        [info] 1 example, 1 failure, 0 error
        [info] P01Spec
        [info] P01 should
        [info] x Find the last element of a list
        [error]    an implementation is missing (P01.scala:4)
        [info] Total for specification P01Spec
        [info] Finished in 31 ms
        [info] 1 example, 1 failure, 0 error
        [info] P02Spec
        [info] P02 should
        [info] x Find the last but one element of a list
        [error]    an implementation is missing (P02.scala:4)
        [info] Total for specification P02Spec
        [info] Finished in 3 ms
        [info] 1 example, 1 failure, 0 error
        [error] Failed: : Total 3, Failed 3, Errors 0, Passed 0, Skipped 0
        [error] Failed tests:
        [error]         pl.japila.s99.P02Spec
        [error]         pl.japila.s99.P03Spec
        [error]         pl.japila.s99.P01Spec
        [error] (exercises/test:test) sbt.TestsFailedException: Tests unsuccessful
        [error] Total time: 17 s, completed Aug 6, 2013 7:06:24 AM

Make the tests pass (make them all green). In the above snippet the problems P01 to P03 fail (an implementation is missing).

* Once all the tests get green (the `success` shows up as a result of running the tests), you're almost done.

        [info] Compiling 1 Scala source to /Users/jacek/oss/scalania/exercises/target/scala-2.10/classes...
        [info] P03Spec
        [info] P03 should
        [info] + Find the Kth element of a list
        [info] Total for specification P03Spec
        [info] Finished in 25 ms
        [info] 1 example, 0 failure, 0 error
        [info] P01Spec
        [info] P01 should
        [info] + Find the last element of a list
        [info] Total for specification P01Spec
        [info] Finished in 24 ms
        [info] 1 example, 0 failure, 0 error
        [info] P02Spec
        [info] P02 should
        [info] + Find the last but one element of a list
        [info] Total for specification P02Spec
        [info] Finished in 1 ms
        [info] 1 example, 0 failure, 0 error
        [info] Passed: : Total 3, Failed 0, Errors 0, Passed 3, Skipped 0
        [success] Total time: 3 s, completed Aug 6, 2013 8:15:51 PM

* "Almost" makes a difference really. To finish the exercises, run `sbt 'project exercises' scalastyle` to ensure high quality of your solutions that is manifested with `Found 0 errors` and `Found 0 warnings` in the output.

        jacek:~/oss/scalania
        $ sbt 'project exercises' scalastyle
        [info] Loading global plugins from /Users/jacek/.sbt/plugins
        [info] Loading project definition from /Users/jacek/oss/scalania/project
        [info] Set current project to scalania (in build file:/Users/jacek/oss/scalania/)
        [info] Set current project to scalania-exercises (in build file:/Users/jacek/oss/scalania/)
        Processed 3 file(s)
        Found 0 errors
        Found 0 warnings
        Finished in 5 ms
        [success] created: /Users/jacek/oss/scalania/exercises/target/scalastyle-result.xml
        [success] Total time: 1 s, completed Aug 6, 2013 7:30:04 PM

### How to contribute
A quite productive approach to master Scala is to further extend the project with new tests that show what the language can offer.

Fork [the project](https://github.com/jaceklaskowski/scalania) and send pull requests on GitHub.

Please use topic branches when sending pull requests rather than committing directly to master in order to minimize unnecessary merge commit clutter.

### Tools used
* http://www.scala-sbt.org/
* https://github.com/kobmic/plain-scala.g8
* http://aperiodic.net/phil/scala/s-99/
>>>>>>> P01 from S99
