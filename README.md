## [Scalania](http://scalania.pl) - learn Scala by examples

The project is to help you get started with [Scala](http://scala-lang.org). It's also been used successfully to run Scala hack-a-thons in Warsaw, Poland - see [Scalania](http://scalania.pl) webpage on meetup.

This is a [sbt](http://www.scala-sbt.org/)-based project with tests that are supposed to help people learn (and ultimately master) Scala while solving problems described in [S-99: Ninety-Nine Scala Problems](http://aperiodic.net/phil/scala/s-99/) (package `pl.japila.scalania.s99`) and doing the exercises that accompany the Scala course [Scala i programowanie funkcyjne](http://www.grzegorzbalcerek.net/scalafp.html) or are part of [the Project Euler](http://projecteuler.net/problems) (package `pl.japila.scalania.euler`).

The website of the meetings is [scalania.pl](http://scalania.pl).

### How to get started with the project
* Download the latest version of [sbt](http://www.scala-sbt.org/).
* Pick a test to work on. There are plenty of them in `exercises/main/scala` directory.
Say, you chose `S99_P01`. Run `sbt '~exercises/testOnly *s99.P01*'` (the apostrophes are important to make `*s99.P01*` the parameter of the `testOnly` task).

        $ sbt '~exercises/testOnly *s99.P01*'
        [info] Loading global plugins from /Users/jacek/.sbt/0.13/plugins
        [info] Loading project definition from /Users/jacek/oss/scalania/project
        [info] Set current project to scalania (in build file:/Users/jacek/oss/scalania/)
        [info] P01Spec
        [info]
        [info] P01 solution should
        [info] x Find the last element of a list
        [error]    an implementation is missing (S99_P01.scala:4)
        [info]
        [info]
        [info]
        [info] Total for specification P01Spec
        [info] Finished in 23 ms
        [info] 1 example, 1 failure, 0 error
        [error] Failed: Total 1, Failed 1, Errors 0, Passed 0
        [error] Failed tests:
        [error] 	pl.japila.scalania.s99.P01Spec
        [error] (exercises/test:testOnly) sbt.TestsFailedException: Tests unsuccessful
        [error] Total time: 3 s, completed Oct 22, 2013 11:27:56 PM
        1. Waiting for source changes... (press enter to interrupt)

Make the test pass (make it green). In the above snippet `pl.japila.scalania.s99.P01Spec` fails because of `an implementation is missing`. That's exactly your assignment - to write the implementation.

* Once the test gets green (the `success` shows up as a result of running it), you're *almost* done.

        [info] Formatting 1 Scala source {file:/Users/jacek/oss/scalania/}exercises(compile) ...
        [info] Compiling 1 Scala source to /Users/jacek/oss/scalania/exercises/target/scala-2.10/classes...
        [info] P01Spec
        [info]
        [info] P01 solution should
        [info] + Find the last element of a list
        [info]
        [info]
        [info] Total for specification P01Spec
        [info] Finished in 46 ms
        [info] 1 example, 0 failure, 0 error
        [info] Passed: Total 1, Failed 0, Errors 0, Passed 1
        [success] Total time: 13 s, completed Oct 22, 2013 11:31:20 PM
        2. Waiting for source changes... (press enter to interrupt)

Press `enter` to interrupt and in fact close the sbt session.

Spoiler: There are a few solutions of the exercises that you could execute with `answers/testOnly *s99.P01*`. Just replace `~exercises` with `answers` to kick it off.

* In order to finish the exercises, run `sbt exercises/scalastyle` to ensure high quality of your solutions that is manifested with `Found 0 errors` and `Found 0 warnings` in the output.

        $ sbt exercises/scalastyle
        [info] Loading global plugins from /Users/jacek/.sbt/0.13/plugins
        [info] Loading project definition from /Users/jacek/oss/scalania/project
        [info] Set current project to scalania (in build file:/Users/jacek/oss/scalania/)
        Processed 13 file(s)
        Found 0 errors
        Found 0 warnings
        Finished in 8 ms
        [success] created: /Users/jacek/oss/scalania/exercises/target/scalastyle-result.xml
        [success] Total time: 1 s, completed Oct 22, 2013 11:32:54 PM

### How to open the project in IntelliJ IDEA 13 (Cardea)
* Install the [sbt-idea](https://github.com/mpeltonen/sbt-idea) plugin.
Create `~/.sbt/0.13/plugins/idea.sbt` file and add the following:

        // https://github.com/mpeltonen/sbt-idea
        addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.2")

* Run `sbt gen-idea` in the home directory of the `scalania` project.

        $ sbt gen-idea
        [info] Loading global plugins from /Users/jacek/.sbt/0.13/plugins
        [info] Loading project definition from /Users/jacek/oss/scalania/project
        [info] Set current project to scalania (in build file:/Users/jacek/oss/scalania/)
        [info] Creating IDEA module for project 'scalania' ...
        [info] Resolving org.fusesource.jansi#jansi;1.4 ...
        [info] Creating IDEA module for project 'answers' ...
        [info] Resolving org.fusesource.jansi#jansi;1.4 ...
        [info] Creating IDEA module for project 'exercises' ...
        [info] Resolving org.fusesource.jansi#jansi;1.4 ...
        [info] Excluding folder target
        [info] Created /Users/jacek/oss/scalania/.idea/IdeaProject.iml
        [info] Created /Users/jacek/oss/scalania/.idea
        [info] Excluding folder /Users/jacek/oss/scalania/target
        [info] Created /Users/jacek/oss/scalania/.idea_modules/scalania.iml
        [info] Excluding folder /Users/jacek/oss/scalania/answers/target
        [info] Created /Users/jacek/oss/scalania/.idea_modules/answers.iml
        [info] Excluding folder /Users/jacek/oss/scalania/exercises/target
        [info] Created /Users/jacek/oss/scalania/.idea_modules/exercises.iml
        [info] Created /Users/jacek/oss/scalania/.idea_modules/scalania-build.iml
        [info] Created /Users/jacek/oss/scalania/.idea_modules/exercises-build.iml

* Open the project in [IntelliJ IDEA](http://www.jetbrains.com/idea/). Have fun!

### How to contribute
A quite productive approach to master Scala is to further extend the project with new tests that show what the language can offer.

Clone [the scalania project](https://github.com/jaceklaskowski/scalania) and send pull requests on GitHub.

Please use topic branches when sending pull requests rather than committing directly to master in order to minimize unnecessary merge commit clutter.

* Create a topic branch and switch to it. Say, you want to work on the 100th problem in the Euler Project and the branch gets named `euler_100`.

        $ git checkout -b euler_100
        Switched to a new branch 'euler_100'

* Do the work and `git commit` it.

* `git push origin euler_100`

* Send pull request using GitHub. It should automatically suggest you doing so when your branch has showed up.

* (optional) Once the pull request's accepted, delete the branch from the remote repository `git push origin :euler_100` and from the local repository `git branch -d euler_100`.

### Tools used
* http://www.scala-sbt.org/
* https://github.com/kobmic/plain-scala.g8
* http://aperiodic.net/phil/scala/s-99/
* https://github.com/pavelfatin/projecteuler
