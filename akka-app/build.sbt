name := "akka-app"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % "10.0.0"
)

javaOptions ++= Seq(
  "-Xmx128M",
  "-Xms128M",
  "-Xmn64M",
  "-server", "-verbose:gc",
  "-XX:+PrintGCDateStamps",
  "-XX:+PrintGCTimeStamps",
  "-XX:+PrintGCDetails",
  "-XX:+PrintTenuringDistribution",
  "-XX:+PrintCommandLineFlags",
  "-XX:+PrintReferenceGC",
  "-XX:+PrintAdaptiveSizePolicy",
  "-XX:+UseG1GC"
)

scalacOptions ++= Seq("-feature")

testOptions in Test ++= Seq(
  Tests.Argument(TestFrameworks.ScalaTest, "-o")

)


parallelExecution in Test := false

assemblySettings
