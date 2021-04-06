/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

@file:Suppress("RedundantVisibilityModifier")

package dev.yekta.anynum

/**
 * Converts a [Double] to a [String] of Arabic digits.
 * @return a [String] which contains Arabic numerical digits.
 */
public fun Double.toArString(): String = this.toString().numEnToAr()

/**
 * Converts a [Double] to a [String] of Persian digits.
 * @return a [String] which contains Persian numerical digits.
 */
public fun Double.toFaString(): String = this.toString().numEnToFa()
