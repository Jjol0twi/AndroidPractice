pluginManagement {
    repositories {
        google()    //  google's maven repository
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = java.net.URI("https://devrepo.kakao.com/nexus/content/groups/public/") }  //  kakao developer
        maven { url = java.net.URI("https://jitpack.io")}   //
    }
}

rootProject.name = "MyApplicationWithXML"
include(":app")
 