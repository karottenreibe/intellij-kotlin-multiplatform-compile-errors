# Steps to reproduce

This project was created from the Mobile Android/iOS Kotlin Multiplatform template.

1. Create local.properties with a correctly set `sdk.dir` property for the Android SDK
2. Import project into IntelliJ Community Edition 2019.1 or idea-IU-191.6707.7 under Linux (Ubuntu 18.04 in my case)
3. Wait for synchronize with Gradle and indexing to complete
4. Build project - build succeeds
5. Open Sample.kt

    - *Expected:* Sample.kt has no errors in the IDE
    - *Actual:*

    ```
    Expected property 'dispatcher' has no actual declaration in module intellij-kotlin-native-compile-errors.app.iosMain for Native The following declaration is incompatible because return type is different:
    public actual val dispatcher: [ERROR : CoroutineDispatcher] defined in sample in file SampleIos.kt
    ```

6. Open SampleIos.kt

    - *Expected:* Sample.kt has no errors in the IDE
    - *Actual:*

    ```
    Unresolved reference: coroutines
    ```
