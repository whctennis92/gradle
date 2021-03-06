package Gradle_Promotion.patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with uuid = 'bf9b573a-6e5e-4db1-88b2-399e709026b5' (id = 'Gradle_Promotion_MasterSanityCheck')
accordingly, and delete the patch script.
*/
changeBuildType(uuid("bf9b573a-6e5e-4db1-88b2-399e709026b5")) {
    check(paused == false) {
        "Unexpected paused: '$paused'"
    }
    paused = true
}
