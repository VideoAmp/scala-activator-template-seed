name := """vamp-seed-project"""

organization := "com.videoamp"

scalaVersion := "2.11.7"

scalacOptions ++= Seq(
  "-deprecation", "-unchecked", "-feature", "-Xlint", "-language:postfixOps", "-language:implicitConversions", "-Ywarn-unused"
)

resolvers ++= Seq(
  "vamp repo" at "https://videoamp.artifactoryonline.com/videoamp/repo/"
)

