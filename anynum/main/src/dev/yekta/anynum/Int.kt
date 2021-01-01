/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.anynum

/**
 * Converts an [Int] to a [String] of Arabic digits.
 * @return a [String] which contains Arabic numerical digits.
 */
public fun Int.toArString(): String = this.toLong().toArString()

/**
 * Converts an [Int] to a [String] of Persian digits.
 * @return a [String] which contains Persian numerical digits.
 */
public fun Int.toFaString(): String = this.toLong().toFaString()
