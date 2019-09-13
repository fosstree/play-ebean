ThisBuild / organization := "io.github.fosstree"
ThisBuild / organizationName := "FossTree"
ThisBuild / organizationHomepage := Some(url("https://github.com/fosstree"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/fosstree"),
    "scm:git@github.com:fosstree/play-ebean.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id    = "shubhampatil17",
    name  = "Shubham Patil",
    email = "patil.sm17@gmai.com",
    url   = url("https://github.com/shubhampatil17")
  )
)

ThisBuild / description := "A forked version of the original play-ebean (https://github.com/playframework/play-ebean) with update versions of ebean ORM"
ThisBuild / licenses := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://github.com/fosstree/play-ebean.git"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true