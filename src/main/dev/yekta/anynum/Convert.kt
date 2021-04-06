/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

@file:Suppress("RedundantVisibilityModifier")

package dev.yekta.anynum

internal val enNumRange = 48..57
internal val arNumRange = 1632..1641
internal val faNumRange = 1776..1785

/**
 * Converts digits of [num] to digits of another language.
 */
internal fun convertNums(num: Long, toRange: IntRange): String {
    val difference = toRange.first - enNumRange.first
    val numStr = if (num >= 0) num.toString() else (num * -1).toString()
    val result = if (num >= 0) StringBuilder() else StringBuilder("-")

    numStr.forEach {
        result.append((it.toInt() + difference).toChar())
    }

    return result.toString()
}

/**
 * Converts digits of [str] to digits of another language.
 */
internal fun convertNums(str: String, fromRange: IntRange, toRange: IntRange): String {
    val difference = toRange.first - fromRange.first
    val result = StringBuilder()

    str.forEach {
        result.append(
            if (it.toInt() !in fromRange) it
            else (it.toInt() + difference).toChar()
        )
    }

    return result.toString()
}
