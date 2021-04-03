/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.anynum

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StringTest {
    // Test numToX functions
    @Test
    fun testStringNumToEn() = strCases.forEach { assertEquals(it.en, it.mixed.numToEn()) }

    @Test
    fun testStringNumToAr() = strCases.forEach { assertEquals(it.ar, it.mixed.numToAr()) }

    @Test
    fun testStringNumToFa() = strCases.forEach { assertEquals(it.fa, it.mixed.numToFa()) }

    // Test numEnToX functions
    @Test
    fun testStringNumEnToAr() = strCases.forEach { assertEquals(it.ar, it.en.numEnToAr()) }

    @Test
    fun testStringNumEnToFa() = strCases.forEach { assertEquals(it.fa, it.en.numEnToFa()) }

    // Test numArToX functions
    @Test
    fun testStringNumArToEn() = strCases.forEach { assertEquals(it.en, it.ar.numArToEn()) }

    @Test
    fun testStringNumArToFa() = strCases.forEach { assertEquals(it.fa, it.ar.numArToFa()) }

    // Test numFaToX functions
    @Test
    fun testStringNumFaToEn() = strCases.forEach { assertEquals(it.en, it.fa.numFaToEn()) }

    @Test
    fun testStringNumFaToAr() = strCases.forEach { assertEquals(it.ar, it.fa.numFaToAr()) }
}
