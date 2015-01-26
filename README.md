# [Scalania](http://scalania.pl) - learn Scala by examples

[![Build Status](https://travis-ci.org/jaceklaskowski/scalania.svg?branch=master)](https://travis-ci.org/jaceklaskowski/scalania)
[![Stories in Ready](https://badge.waffle.io/jaceklaskowski/scalania.png?label=ready&title=Ready)](https://waffle.io/jaceklaskowski/scalania)
[![Coverage Status](https://img.shields.io/coveralls/jaceklaskowski/scalania.svg)](https://coveralls.io/r/jaceklaskowski/scalania)

**[How to get started with the project](#how-to-get-started-with-the-project)** |
**[How to open the project in IntelliJ IDEA 14.0.2](#how-to-open-the-project-in-intellij-idea-1402)** |
**[How to contribute](#how-to-contribute)** |
**[Tools used](#tools-used)**

The project's aim is to smooth your learning path to master [Scala](http://scala-lang.org) programming language.
It's been very successful during [@WarszawScala](https://twitter.com/WarszawScaLa/) meetups in Warsaw, Poland - see [Scalania](http://scalania.pl) webpage on meetup.

The project uses [Typesafe Activator](http://typesafe.com/activator) and offers tests with answers that are all supposed to help
people learning (and ultimately mastering) Scala while solving problems described in [S-99: Ninety-Nine Scala Problems](http://aperiodic.net/phil/scala/s-99/) (package `pl.japila.scalania.s99`) and doing the exercises that accompany the Scala course [Scala i programowanie funkcyjne](http://www.grzegorzbalcerek.net/scalafp.html) or are part of [the Project Euler](http://projecteuler.net/problems) (package `pl.japila.scalania.euler`). Recently, examples from StackOverflow have been added.

[Warsaw Scala Enthusiasts](http://warsawscala.pl/) group has been using the project quite regularly during their meetups.

## How to get started with the project

* In the directory where you downloaded (cloned) the `scalania` project, e.g. `~/oss/scalania`, run `./activator` (on Mac OS/Linux) or `activator` (on Windows).

        ➜  scalania git:(master) ./activator
        [info] Loading global plugins from /Users/jacek/.sbt/0.13/plugins
        [info] Loading project definition from /Users/jacek/dev/oss/scalania/project
        [info] Set current project to scalania (in build file:/Users/jacek/dev/oss/scalania/)
        [scalania]>

* Pick a problem to work on. They are in `exercises/src/main/scala` directory.

    Say, you want to start with `pl.japila.scalania.collection.P06`. Run the corresponding test specification using `~exercises/testOnly *collection.P06Spec*` (the asterisks are important as they are a part of a regular expression).
    
    Hint: Use [TAB] while in the activator shell.

        [scalania]> ~exercises/testOnly *collection.P06Spec*
        [info] P06Spec
        [info] 
        [info] isNumeric should
        [info] x Check whether all elements in a sequence are numeric.
        [error]    an implementation is missing (P06.scala:7)
        [info] 
        [info] 
        [info] Total for specification P06Spec
        [info] Finished in 13 ms
        [info] 1 example, 1 failure, 0 error
        [info]  
        [info] ScalaTest
        [info] Run completed in 582 milliseconds.
        [info] Total number of tests run: 0
        [info] Suites: completed 0, aborted 0
        [info] Tests: succeeded 0, failed 0, canceled 0, ignored 0, pending 0
        [info] No tests were executed.
        [error] Failed: Total 1, Failed 1, Errors 0, Passed 0
        [error] Failed tests:
        [error]         pl.japila.scalania.collection.P06Spec
        [error] (exercises/test:testOnly) sbt.TestsFailedException: Tests unsuccessful
        [error] Total time: 1 s, completed Jan 25, 2015 10:40:41 PM
        1. Waiting for source changes... (press enter to interrupt)

Make the test pass (make it green). In the above snippet `pl.japila.scalania.collection.P06Spec` fails because of `an implementation is missing`.
That's exactly your assignment - to write the implementation.

In this particular case you're supposed to write the implementation of `pl.japila.scalania.collection.P06` object in `exercises` project.

* Once the test becomes green (the *success* shows up as a result of running it), you're *almost* done. Note the number of expectations is `100` that means that there were 100 tests executed against the exercise.

        1. Waiting for source changes... (press enter to interrupt)
        [info] Formatting 1 Scala source {file:/Users/jacek/dev/oss/scalania/}exercises(compile) ...
        [info] Compiling 1 Scala source to /Users/jacek/dev/oss/scalania/exercises/target/scala-2.11/classes...
        [info] P06Spec
        [info] 
        [info] isNumeric should
        [info] + Check whether all elements in a sequence are numeric.
        [info] 
        [info] Total for specification P06Spec
        [info] Finished in 15 ms
        [info] 1 example, 0 failure, 0 error
        [info]  
        [info] ScalaTest
        [info] Run completed in 689 milliseconds.
        [info] Total number of tests run: 0
        [info] Suites: completed 0, aborted 0
        [info] Tests: succeeded 0, failed 0, canceled 0, ignored 0, pending 0
        [info] No tests were executed.
        [info] Passed: Total 1, Failed 0, Errors 0, Passed 1
        [success] Total time: 2 s, completed Jan 26, 2015 7:10:00 AM
        2. Waiting for source changes... (press enter to interrupt)

Press `Enter` to interrupt.

Spoiler: There are a few solutions of the exercises that you could execute with `answers/testOnly *collection.P06*`.
Just replace `~exercises` with `answers` to kick it off.

        [scalania]> answers/testOnly *collection.P06*
        [info] [scapegoat] setting output dir to [/Users/jacek/dev/oss/scalania/answers/target/scala-2.11/scapegoat-report]
        [info] [scapegoat] disabled inspections: X
        [info] [scapegoat] enabled inspections: ArraysToString
        [info] [scapegoat] ignored file patterns: X
        [info] [scapegoat] setting output dir to [/Users/jacek/dev/oss/scalania/exercises/target/scala-2.11/scapegoat-report]
        [info] [scapegoat] disabled inspections: X
        [info] [scapegoat] enabled inspections: ArraysToString
        [info] [scapegoat] ignored file patterns: X
        [info] P06Spec
        [info]
        [info] isNumeric should
        [info] + Check whether all elements in a sequence are numeric.
        [info]
        [info] Total for specification P06Spec
        [info] Finished in 16 ms
        [info] 1 example, 0 failure, 0 error
        [info]
        [info] ScalaTest
        [info] Run completed in 754 milliseconds.
        [info] Total number of tests run: 0
        [info] Suites: completed 0, aborted 0
        [info] Tests: succeeded 0, failed 0, canceled 0, ignored 0, pending 0
        [info] No tests were executed.
        [info] Passed: Total 1, Failed 0, Errors 0, Passed 1
        [success] Total time: 1 s, completed Jan 26, 2015 9:11:10 PM

* In order to finish the exercises, run `exercises/scalastyle` to ensure high quality of your solutions that is 
manifested with `Found 0 errors` and `Found 0 warnings` in the output.

        [scalania]> exercises/scalastyle
        [info] scalastyle using config /Users/jacek/dev/oss/scalania/project/scalastyle_config.xml
        [info] Processed 43 file(s)
        [info] Found 0 errors
        [info] Found 0 warnings
        [info] Found 0 infos
        [info] Finished in 5 ms
        [success] created output: /Users/jacek/dev/oss/scalania/exercises/target
        [success] Total time: 1 s, completed Jan 26, 2015 9:07:19 PM

## How to open the project in IntelliJ IDEA 14.0.2

[IntelliJ IDEA](http://www.jetbrains.com/idea/) supports Scala/sbt projects with [the Scala plugin](http://plugins.jetbrains.com/plugin/?id=1347).
Install the plugin and then `File > Import Project...`. Select `SBT`, click `Next` and have fun!

It's however highly recommended using [the latest unreleased version of IntelliJ IDEA 14.0.3 EAP](https://confluence.jetbrains.com/display/IDEADEV/IDEA+14+EAP) with [the latest development version of Scala plugin 1.3 EAP](https://confluence.jetbrains.com/display/SCA/Scala+plugin+EAP) since they bring a wealth of very productive features.

## How to contribute

A quite productive approach to master Scala is to further extend the project with new tests that show what the Scala language can offer.

`git clone` [the scalania project](https://github.com/jaceklaskowski/scalania) and send pull requests on GitHub.

Please use topic branches when sending pull requests rather than committing directly to master in order to minimize unnecessary merge commit clutter.

* Create a topic branch and switch to it immediately. Say, you want to work on the 100th problem in the Euler Project and the branch gets named `euler_100`.

        $ git checkout -b euler_100
        Switched to a new branch 'euler_100'

* Do the work and `git commit` it.

        $ git commit -am 'New tests for Euler 100'

* Push the `euler_100` branch to your remote fork `myfork`.

        $ git push myfork euler_100

* Send pull request using GitHub. It should automatically suggest you doing so when your branch has showed up.

* (optional) Once the pull request's accepted, delete the branch from the remote repository and from the local repository.

        $ git push myfork :euler_100
        $ git branch -d euler_100

## Tools used

* http://www.scala-sbt.org/
* https://github.com/kobmic/plain-scala.g8
* http://aperiodic.net/phil/scala/s-99/
* https://github.com/pavelfatin/projecteuler
* http://specs2.org
