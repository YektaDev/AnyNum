/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

/**
 * Converts digits of [num] to digits of another language.
 */
private fun convertNums(num: Long, toRange: IntRange): String {
    var result = ""
    val difference = toRange.first - enNumRange.first

    for (c in num.toString())
        result += (c.toInt() + difference).toChar()

    return result
}

/**
 * Converts digits of [str] to digits of another language.
 */
private fun convertNums(str: String, fromRange: IntRange, toRange: IntRange): String {
    var result = ""
    val difference = toRange.first - fromRange.first

    for (c in str)
        result += if (c.toInt() !in fromRange)
            c
        else
            (c.toInt() + difference).toChar()

    return result
}
