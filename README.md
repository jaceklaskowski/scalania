# [Scalania] (http://scalania.pl) - Learn Scala by Examples,,

[![Join the chat at https://gitter.im/jaceklaskowski/scalania](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/jaceklaskowski/scalania?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Build Status](https://travis-ci.org/jaceklaskowski/scalania.svg?branch=master)](https://travis-ci.org/jaceklaskowski/scalania)
[![Stories in Ready](https://badge.waffle.io/jaceklaskowski/scalania.png?label=ready&title=Ready)](https://waffle.io/jaceklaskowski/scalania)
[![Coverage Status](https://img.shields.io/coveralls/jaceklaskowski/scalania.svg)](https://coveralls.io/r/jaceklaskowski/scalania)

**[How to get started with the project](#how-to-get-started-with-the-project)** |
**[How to open the project in IntelliJ IDEA 14.0.3](#how-to-open-the-project-in-intellij-idea-1403)** |
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

    Say, you want to start with `pl.japila.scalania.collection.P07`. Run the corresponding test specification using `~exercises/testOnly *collection.P07Spec*` (the asterisks are important as they are a part of a regular expression).
    
    Hint: Use [TAB] while in the activator shell.

        [scalania]> ~exercises/testOnly *collection.P07Spec*
        [info] [scapegoat] setting output dir to [/Users/jacek/dev/oss/scalania/exercises/target/scala-2.11/scapegoat-report]
        [info] [scapegoat] disabled inspections: X
        [info] [scapegoat] enabled inspections: ArraysToString
        [info] [scapegoat] ignored file patterns: X
        [info] P07Spec
        [info] 
        [info] sumOfPrecedingElements should
        [info] x Sum all preceding elements in a collection.
        [error]    an implementation is missing (P07.scala:7)
        [info] 
        [info] 
        [info] Total for specification P07Spec
        [info] Finished in 22 ms
        [info] 1 example, 1 failure, 0 error
        [info]  
        [info] ScalaTest
        [info] Run completed in 665 milliseconds.
        [info] Total number of tests run: 0
        [info] Suites: completed 0, aborted 0
        [info] Tests: succeeded 0, failed 0, canceled 0, ignored 0, pending 0
        [info] No tests were executed.
        [error] Failed: Total 1, Failed 1, Errors 0, Passed 0
        [error] Failed tests:
        [error]         pl.japila.scalania.collection.P07Spec
        [error] (exercises/test:testOnly) sbt.TestsFailedException: Tests unsuccessful
        [error] Total time: 1 s, completed Jan 28, 2015 10:44:15 PM
        1. Waiting for source changes... (press enter to interrupt)

Make the test pass (make it green). In the above snippet `pl.japila.scalania.collection.P07Spec` fails because of `an implementation is missing`.
That's exactly your assignment - to write the implementation.

In this particular case you're supposed to write the implementation of `pl.japila.scalania.collection.P07` object in `exercises` project.

* Once the test becomes green (the *success* shows up as a result of running it), you're *almost* done. Note the number of expectations is `100` that means that there were 100 tests executed against the exercise.

        1. Waiting for source changes... (press enter to interrupt)
        [info] Formatting 1 Scala source {file:/Users/jacek/dev/oss/scalania/}exercises(compile) ...
        [info] [scapegoat] setting output dir to [/Users/jacek/dev/oss/scalania/exercises/target/scala-2.11/scapegoat-report]
        [info] [scapegoat] disabled inspections: X
        [info] [scapegoat] enabled inspections: ArraysToString
        [info] [scapegoat] ignored file patterns: X
        [info] Compiling 1 Scala source to /Users/jacek/dev/oss/scalania/exercises/target/scala-2.11/classes...
        [info] [scapegoat] 107 activated inspections
        [info] [scapegoat] List(X) ignored file patterns
        [info] P07Spec
        [info] 
        [info] sumOfPrecedingElements should
        [info] + Sum all preceding elements in a collection.
        [info] 
        [info] Total for specification P07Spec
        [info] Finished in 13 ms
        [info] 1 example, 0 failure, 0 error
        [info]  
        [info] ScalaTest
        [info] Run completed in 606 milliseconds.
        [info] Total number of tests run: 0
        [info] Suites: completed 0, aborted 0
        [info] Tests: succeeded 0, failed 0, canceled 0, ignored 0, pending 0
        [info] No tests were executed.
        [info] Passed: Total 1, Failed 0, Errors 0, Passed 1
        [success] Total time: 2 s, completed Jan 28, 2015 10:46:06 PM
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
        [info] Processed 44 file(s)
        [info] Found 0 errors
        [info] Found 0 warnings
        [info] Found 0 infos
        [info] Finished in 1 ms
        [success] created output: /Users/jacek/dev/oss/scalania/exercises/target
        [success] Total time: 0 s, completed Jan 28, 2015 10:48:22 PM

## How to open the project in IntelliJ IDEA 14.0.3

[IntelliJ IDEA](http://www.jetbrains.com/idea/) supports Scala/sbt projects with [the Scala plugin](http://plugins.jetbrains.com/plugin/?id=1347).
Install the plugin and then `File > Import Project...`. Select `SBT`, click `Next` and have fun!

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
