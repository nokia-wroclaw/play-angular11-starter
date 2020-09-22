lazy val root = (project in file("."))
  .enablePlugins(PlayJava, PlayAkkaHttp2Support)
  .settings(
    name := """play-angular-starter""",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.3",
    libraryDependencies ++= Seq(
      guice,
      // Test Database
      "com.h2database" % "h2" % "1.4.200",
      // Testing libraries for dealing with CompletionStage...
      "org.assertj" % "assertj-core" % "3.17.2" % Test,
      "org.awaitility" % "awaitility" % "4.0.3" % Test,
    ),
    javacOptions ++= Seq(
      "-encoding", "UTF-8",
      "-parameters",
      "-Xlint:unchecked",
      "-Xlint:deprecation",
      "-Werror"
    ),
    // Make verbose tests
    testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))
  )
