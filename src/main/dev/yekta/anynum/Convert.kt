/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.anynum

/**
 * Converts digits of [num] to digits of another language.
 */
internal fun convertNums(num: Long, toRange: IntRange): String {
    val difference = toRange.first - enNumRange.first
    val numStr = if (num >= 0) num.toString() else (num * -1).toString()
    var result = if (num >= 0) "" else "-"

    numStr.forEach {
        result += (it.toInt() + difference).toChar()
    }

    return result
}

/**
 * Converts digits of [str] to digits of another language.
 */
internal fun convertNums(str: String, fromRange: IntRange, toRange: IntRange): String {
    val difference = toRange.first - fromRange.first
    var result = ""

    str.forEach {
        result +=
            if (it.toInt() !in fromRange) it
            else (it.toInt() + difference).toChar()
    }

    return result
}
