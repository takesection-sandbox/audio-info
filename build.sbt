lazy val root = (project in file(".")).
  enablePlugins(JavaAppPackaging, AshScriptPlugin, DockerPlugin).
  settings(
    name := "audio-info",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.12.3",
    dockerBaseImage := "takesection/openjdk",
    daemonUser in Docker := "root"
  )