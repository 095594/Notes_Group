pluginManagement {
    repositories {
        google()
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

rootProject.name = "Notes_Group"
include(":app")
include(":sharedpreferences")
include(":sql_lite")
include(":roompersistencelibrary")
include(":contentproviders")
include(":firebase")
