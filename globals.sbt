inScope(Global) {
  Seq(
    organization        := "pl.japila",
    name                := "scalania",
    version             := "0.1.0-SNAPSHOT",
    scalaVersion        := Version.scala,
    libraryDependencies := Dependencies.libraries,
    javaOptions         += "-server",
    resolvers           ++= Seq("snapshots", "releases") map Resolver.sonatypeRepo
  )
}
