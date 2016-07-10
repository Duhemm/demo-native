name := "demoNative"

ScalaNativePlugin.projectSettings

scalaVersion := "2.11.8"

nativeVerbose := true

nativeClangOptions ++= Seq("-O0")
