## [Scalania](http://scalania.pl) - learn Scala by examples

[![Build Status](https://travis-ci.org/jaceklaskowski/scalania.svg?branch=master)](https://travis-ci.org/jaceklaskowski/scalania) [![Stories in Ready](https://badge.waffle.io/jaceklaskowski/scalania.png?label=ready&title=Ready)](https://waffle.io/jaceklaskowski/scalania)

The project's aim is to smooth your learning path to developing applications in [Scala](http://scala-lang.org).
It's been very successful during [@WarszawScala](https://twitter.com/WarszawScaLa/) meetups in Warsaw, Poland - see [Scalania](http://scalania.pl) webpage on meetup.

The project uses [sbt](http://www.scala-sbt.org/) and offers tests and their answers that are all supposed to help
people learning (and ultimately mastering) Scala while solving problems described in [S-99: Ninety-Nine Scala Problems](http://aperiodic.net/phil/scala/s-99/) (package `pl.japila.scalania.s99`) and doing the exercises that accompany the Scala course [Scala i programowanie funkcyjne](http://www.grzegorzbalcerek.net/scalafp.html) or are part of [the Project Euler](http://projecteuler.net/problems) (package `pl.japila.scalania.euler`).

[The Warszawa Scala User Group](http://www.meetup.com/WarszawScaLa/) uses the project regularly during the meetings.

### How to get started with the project
* Download and install the latest version of [sbt](http://www.scala-sbt.org/) or [Typesafe Activator](https://typesafe.com/activator).
* In the directory where you downloaded (cloned) the `scalania` project, e.g. `~/oss/scalania`, run `sbt` or `activator`
(depending on the tool you've downloaded to manage the project).

        jacek:~/oss/scalania
        $ sbt
        [info] Loading project definition from /Users/jacek/oss/scalania/project
        [info] Set current project to scalania (in build file:/Users/jacek/oss/scalania/)
        >

* Pick a problem to work on. There are quite a few in `exercises/src/main/scala` directory.
Say, you want to start with `pl.japila.scalania.s99.S99_P01`. Run the corresponding test specification using `~exercises/testOnly *s99.P01*` (the asterisks are important to denote a regular expression).
Hint: Use [TAB] while in sbt's interactive shell.

        > ~exercises/testOnly *s99.P01*
        [info] P01Spec
        [info]
        [info] P01 solution should
        [info] x Find the last element of a list
        [error]    an implementation is missing (S99_P01.scala:4)
        [info]
        [info]
        [info] Total for specification P01Spec
        [info] Finished in 12 ms
        [info] 1 example, 1 failure, 0 error
        [error] Failed: Total 1, Failed 1, Errors 0, Passed 0
        [error] Failed tests:
        [error] 	pl.japila.scalania.s99.P01Spec
        [error] (exercises/test:testOnly) sbt.TestsFailedException: Tests unsuccessful
        [error] Total time: 1 s, completed Jun 8, 2014 4:09:55 PM
        1. Waiting for source changes... (press enter to interrupt)

Make the test pass (make it green). In the above snippet `pl.japila.scalania.s99.P01Spec` fails because of `an implementation is missing`.
That's exactly your assignment - to write the implementation.

In this case you'd have to write the implementation of `pl.japila.scalania.s99.S99_P01` object.

* Once the test gets green (the *success* shows up as a result of running it), you're *almost* done.

        [info] Formatting 1 Scala source {file:/Users/jacek/oss/scalania/}exercises(compile) ...
        [info] Reformatted 1 Scala source {file:/Users/jacek/oss/scalania/}exercises(compile).
        [info] Compiling 1 Scala source to /Users/jacek/oss/scalania/exercises/target/scala-2.11/classes...
        [info] P01Spec
        [info]
        [info] P01 solution should
        [info] + Find the last element of a list
        [info]
        [info] Total for specification P01Spec
        [info] Finished in 12 ms
        [info] 1 example, 0 failure, 0 error
        [info] Passed: Total 1, Failed 0, Errors 0, Passed 1
        [success] Total time: 1 s, completed Jun 8, 2014 4:14:33 PM
        2. Waiting for source changes... (press enter to interrupt)

Press `Enter` to interrupt.

Spoiler: There are a few solutions of the exercises that you could execute with `answers/testOnly *s99.P01*`.
Just replace `~exercises` with `answers` to kick it off.

* In order to finish the exercises, run `exercises/scalastyle` to ensure high quality of your solutions that is 
manifested with `Found 0 errors` and `Found 0 warnings` in the output.

        > exercises/scalastyle
        Processed 29 file(s)
        Found 0 errors
        Found 0 warnings
        Finished in 1 ms
        [success] created: /Users/jacek/oss/scalania/exercises/target/scalastyle-result.xml
        [success] Total time: 1 s, completed Jun 8, 2014 4:15:54 PM

### How to open the project in IntelliJ IDEA 13.1.3

[IntelliJ IDEA](http://www.jetbrains.com/idea/) supports Scala/sbt projects with [the Scala plugin](http://plugins.jetbrains.com/plugin/?id=1347). Have fun!

### How to contribute
A quite productive approach to master Scala is to further extend the project with new tests that show what the Scala language can offer.

`git clone` [the scalania project](https://github.com/jaceklaskowski/scalania) and send pull requests on GitHub.

Please use topic branches when sending pull requests rather than committing directly to master in order to minimize unnecessary merge commit clutter.

* Create a topic branch and switch to it immediately. Say, you want to work on the 100th problem in the Euler Project and the branch gets named `euler_100`.

        $ git checkout -b euler_100
        Switched to a new branch 'euler_100'

* Do the work and `git commit` it.

        $ git commit -m 'New tests for Euler 100' -a

* Push the `euler_100` branch to your remote fork `myfork`.

        $ git push myfork euler_100

* Send pull request using GitHub. It should automatically suggest you doing so when your branch has showed up.

* (optional) Once the pull request's accepted, delete the branch from the remote repository `git push myfork :euler_100` and from the local repository `git branch -d euler_100`.

### Tools used
* http://www.scala-sbt.org/
* https://github.com/kobmic/plain-scala.g8
* http://aperiodic.net/phil/scala/s-99/
* https://github.com/pavelfatin/projecteuler
* http://specs2.org
