name := "test2"

version := "0.1"

scalaVersion := "2.13.5"


val AkkaVersion = "2.6.14"

libraryDependencies += "com.google.apis" % "google-api-services-youtube" % "v3-rev174-1.22.0"

libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion