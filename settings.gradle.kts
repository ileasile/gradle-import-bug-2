rootProject.name = "gradle-import-bug-2"

includeBuild("included")
include("common")

project(":common").projectDir = file("included/common")
