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
    var result = ""
    val difference = toRange.first - enNumRange.first

    if (num >= 0) {
        val numStr = num.toString()

        for (c in numStr) {
            result += (c.toInt() + difference).toChar()
        }
    } else {
        val numStr = (num * -1).toString()
        result += '-'

        for (c in numStr) {
            result += (c.toInt() + difference).toChar()
        }
    }

    return result
}

/**
 * Converts digits of [str] to digits of another language.
 */
internal fun convertNums(str: String, fromRange: IntRange, toRange: IntRange): String {
    var result = ""
    val difference = toRange.first - fromRange.first

    for (c in str)
        result += if (c.toInt() !in fromRange)
            c
        else
            (c.toInt() + difference).toChar()

    return result
}
