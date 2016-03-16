import ReleaseTransformations._

releaseProcess :=
  Seq[ReleaseStep](
    checkSnapshotDependencies,
    inquireVersions,
    releaseStepTask(scalariformFormat in Compile),
    setReleaseVersion,
    commitReleaseVersion,
    tagRelease,
    releaseStepTask(assembly),
    setNextVersion,
    commitNextVersion,
    pushChanges
  )
