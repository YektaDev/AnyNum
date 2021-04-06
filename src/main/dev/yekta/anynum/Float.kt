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
 * Converts a [Float] to a [String] of Arabic digits.
 * @return a [String] which contains Arabic numerical digits.
 */
public fun Float.toArString(): String = this.toString().numEnToAr()

/**
 * Converts a [Float] to a [String] of Persian digits.
 * @return a [String] which contains Persian numerical digits.
 */
public fun Float.toFaString(): String = this.toString().numEnToFa()
