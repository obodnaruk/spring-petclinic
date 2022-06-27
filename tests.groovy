plugins {
    id 'groovy'
}

dependencies {
    implementation gradleApi()
}

task openUrlInBrowser {
   doLast {
       java.awt.Desktop.desktop.browse "http://www.google.com".toURI()
   }
}