/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.anynum

// A data class for (children of) [Number] extensions.
internal data class NumTestCase(
    val long: Long,    // Test case as a Long.
    val enNum: String, // Test case as a String with all of its digits converted to English.
    val arNum: String, // Test case as a String with all of its digits converted to Arabic.
    val faNum: String, // Test case as a String with all of its digits converted to Persian.
)

// A data class for [String] extensions.
internal data class StrTestCase(
    val mixed: String, // Test case as a String with digits of all supported languages.
    val en: String,    // Test case as a String with all of its digits converted to English.
    val ar: String,    // Test case as a String with all of its digits converted to Arabic.
    val fa: String,    // Test case as a String with all of its digits converted to Persian.
)
