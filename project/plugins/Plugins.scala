import sbt._
class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val a = "geelen" % "sbt-plugins" % "0.1"
}