name := "stopwatch-core"

organization := "org.digimead"

version := "1.0-SNAPSHOT"

description := "A project for profiling Scala code"

publishTo  <<= baseDirectory  { (base) => Some(Resolver.file("file",  base / "../publish/releases" )) }
