<p align="center"><img src="res/AnyNum.svg" width="400" alt="AnyNum"></p>

<p align="center">A set of Kotlin extension functions to convert/generate <strong>English</strong>, <strong>Persian</strong>, and <strong>Arabic</strong> digits with ease.</p>

<p align="center">
    <a href="https://github.com/YektaDev/AnyNum/blob/main/LICENSE"><img alt="License" src="https://img.shields.io/static/v1?label=License&message=Apache-2.0&color=43A047"></a>
    <a href="https://en.wikipedia.org/wiki/Electricity"><img alt="Powered By" src="https://img.shields.io/static/v1?label=Powered%20By&message=Electricity&color=FB8C00"></a>
    <a href="https://github.com/JetBrains/kotlin"><img alt="Made With" src="https://img.shields.io/static/v1?label=Made%20With&message=Kotlin&color=D81B60"></a>
</p>

## Dependency
#### Note: AnyNum is now stable and ready to use, but is still in the proccess of being published.
### Step 1
Add the **JitPack** repository in your root `build.gradle` at the end of repositories (if it doesn't exist):
``` groovy
allprojects {
    repositories {
        // Other repositories...
        maven { url 'https://jitpack.io' }
    }
}
```
### Step 2
Add the **dependency**:
``` groovy
dependencies {
    implementation 'com.github.YektaDev:AnyNum:-SNAPSHOT'
}
```
## Common Usages
##### AnyNum contains below functions:

`Number.toArString()`: **Generates Arabic digits.**

`Number.toFaString()`: **Generates Persian digits.**

`String.numToEn()`: **Convertes Arabic & Persian digits to English.**

`String.numToAr()`: **Convertes English & Persian digits to Arabic.**

`String.numToFa()`: **Convertes English & Arabic digits to Persian.**

**Note:** a Number can be `Byte`, `Short`, `Int`, `Long`, `Float`, or `Double`.

## Other Usages

`String.numArToEn()`: Convertes Arabic digits to English.

`String.numFaToEn()`: Convertes Persian digits to English.

`String.numEnToAr()`: Convertes English digits to Arabic.

`String.numFaToAr()`: Convertes Persian digits to Arabic.

`String.numEnToFa()`: Convertes English digits to Persian.

`String.numArToFa()`: Convertes Arabic digits to Persian.
