val scala3Version = "3.0.3-RC1-bin-SNAPSHOT"

Compile / doc / scalacOptions ++= Seq(
  "-d", "./inkuiredb",
  "-Ygenerate-inkuire",
  "-Yno-doc",
  "-Ydoc-classpath"
)

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-playground",
    version := "0.1.0",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "1.0.10",
      // "com.github.ghik" % "silencer-lib_2.13.6" % "1.7.5" //had to add this :/
    )
  )
