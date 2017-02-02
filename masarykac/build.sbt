import com.typesafe.sbt.less.Import.LessKeys
import play.PlayJava

name := """masarykac"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  javaEbean,
  ws,
  "org.mindrot" % "jbcrypt" % "0.3m",
  "org.webjars" % "bootstrap" % "3.3.2",
  "org.webjars" % "metisMenu" % "1.1.3",
  "org.webjars" % "morrisjs" % "0.5.1",
  "org.webjars" % "font-awesome" % "4.3.0",
  "org.webjars" % "jquery" % "2.1.3",
  "org.webjars" % "flot" % "0.8.3",
  "org.webjars" % "datatables" % "1.10.5",
  "org.webjars" % "datatables-plugins" % "1.10.5",
  "com.newrelic.agent.java" % "newrelic-agent" % "3.14.0",
  "com.newrelic.agent.java" % "newrelic-api" % "3.14.0"
)

includeFilter in (Assets, LessKeys.less) := "sb-admin-2.less" | "tables.less"
