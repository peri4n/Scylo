name := "Scylo"

version := "0.0.1"

scalaVersion := "2.10.0"

resolvers ++= Seq(
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= Seq (
		    "org.scalatest" % "scalatest_2.10" % "2.0.1-SNAP" % "test",
		    "org.lanyard" %% "lanyard" % "0.0.1"
)

scalacOptions ++= Seq ("-unchecked", "-feature", "-deprecation", "-optimize" )