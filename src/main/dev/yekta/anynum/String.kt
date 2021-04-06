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
 * Converts all Arabic/Persian digits of a [String] to English digits.
 * @return a [String] in which all Arabic/Persian numerical digits are converted to English.
 */
public fun String.numToEn(): String = this.numArToEn().numFaToEn()

/**
 * Converts all English/Persian digits of a [String] to Arabic digits.
 * @return a [String] in which all English/Persian numerical digits are converted to Arabic.
 */
public fun String.numToAr(): String = this.numEnToAr().numFaToAr()

/**
 * Converts all English/Arabic digits of a [String] to Persian digits.
 * @return a [String] in which all English/Arabic numerical digits are converted to Persian.
 */
public fun String.numToFa(): String = this.numEnToFa().numArToFa()

/**
 * Converts all English digits of a [String] to Arabic digits.
 * @return a [String] in which all English numerical digits are converted to Arabic.
 */
public fun String.numEnToAr(): String = convertNums(this, enNumRange, arNumRange)

/**
 * Converts all English digits of a [String] to Persian digits.
 * @return a [String] in which all English numerical digits are converted to Persian.
 */
public fun String.numEnToFa(): String = convertNums(this, enNumRange, faNumRange)

/**
 * Converts all Arabic digits of a [String] to English digits.
 * @return a [String] in which all Arabic numerical digits are converted to English.
 */
public fun String.numArToEn(): String = convertNums(this, arNumRange, enNumRange)

/**
 * Converts all Arabic digits of a [String] to Persian digits.
 * @return a [String] in which all Arabic numerical digits are converted to Persian.
 */
public fun String.numArToFa(): String = convertNums(this, arNumRange, faNumRange)

/**
 * Converts all Persian digits of a [String] to English digits.
 * @return a [String] in which all Persian numerical digits are converted to English.
 */
public fun String.numFaToEn(): String = convertNums(this, faNumRange, enNumRange)

/**
 * Converts all Persian digits of a [String] to Arabic digits.
 * @return a [String] in which all Persian numerical digits are converted to Arabic.
 */
public fun String.numFaToAr(): String = convertNums(this, faNumRange, arNumRange)
