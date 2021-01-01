/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

/**
 * Converts a [Byte] to a [String] of Arabic digits.
 * @return a [String] which contains Arabic numerical digits.
 */
fun Byte.toArString(): String = this.toLong().toArString()

/**
 * Converts a [Byte] to a [String] of Persian digits.
 * @return a [String] which contains Persian numerical digits.
 */
fun Byte.toFaString(): String = this.toLong().toFaString()
