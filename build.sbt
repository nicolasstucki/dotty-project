name := "application"
version := "0.1"
enablePlugins(DottyPlugin)

libraryDependencies += "org.scala-sbt" %  "test-interface" % "1.0"

scalacOptions ++= Seq(
  "-deprecation",
  "-migration"
)
