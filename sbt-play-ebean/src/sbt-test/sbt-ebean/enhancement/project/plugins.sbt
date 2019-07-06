resolvers ++= DefaultOptions.resolvers(snapshot = true)
addSbtPlugin("io.github.fosstree" % "sbt-play-ebean" % sys.props("play-ebean.version"))