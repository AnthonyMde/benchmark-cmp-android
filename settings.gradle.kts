pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "cmp-android"
include(":app")
include(":umbrella")
include(":umbrella:data")
include(":umbrella:analytics")
project(":umbrella").projectDir = File(rootDir, "shared/umbrella")
project(":umbrella:data").projectDir = File(rootDir, "shared/umbrella/data")
project(":umbrella:analytics").projectDir = File(rootDir, "shared/umbrella/analytics")
