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
    fun testStringNumToEn() {
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_EN], stringList[INDEX_MIXED].numToEn())
        }
    }

    @Test
    fun testStringNumToAr() {
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_AR], stringList[INDEX_MIXED].numToAr())
        }
    }

    @Test
    fun testStringNumToFa() {
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_FA], stringList[INDEX_MIXED].numToFa())
        }
    }

    // Test numEnToX functions
    @Test
    fun testStringNumEnToAr() {
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_AR], stringList[INDEX_EN].numEnToAr())
        }
    }

    @Test
    fun testStringNumEnToFa() {
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_FA], stringList[INDEX_EN].numEnToFa())
        }
    }

    // Test numArToX functions
    @Test
    fun testStringNumArToEn() {
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_EN], stringList[INDEX_AR].numArToEn())
        }
    }

    @Test
    fun testStringNumArToFa() {
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_FA], stringList[INDEX_AR].numArToFa())
        }
    }

    // Test numFaToX functions
    @Test
    fun testStringNumFaToEn() {
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_EN], stringList[INDEX_FA].numFaToEn())
        }
    }

    @Test
    fun testStringNumFaToAr() {
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_AR], stringList[INDEX_FA].numFaToAr())
        }
    }
}
