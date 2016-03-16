scalastyleConfigUrl := Some(url("https://raw.githubusercontent.com/VideoAmp/scalastyle-config/master/scalastyle-config.xml"))

assembly <<= assembly dependsOn (scalastyle in Compile).toTask("")
