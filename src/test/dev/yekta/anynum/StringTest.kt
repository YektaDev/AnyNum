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
    fun checkStringNumToAr() {
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_AR], stringList[INDEX_MIXED].numToAr())
        }
    }

    @Test
    fun checkStringNumToFa() {
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_FA], stringList[INDEX_MIXED].numToFa())
        }
    }

    // Test numEnToX functions
    @Test
    fun checkStringNumEnToAr() {
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_AR], stringList[INDEX_EN].numEnToAr())
        }
    }

    @Test
    fun checkStringNumEnToFa() {
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_FA], stringList[INDEX_EN].numEnToFa())
        }
    }

    // Test numArToX functions
    @Test
    fun checkStringNumArToEn() {
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_EN], stringList[INDEX_AR].numArToEn())
        }
    }

    @Test
    fun checkStringNumArToFa() {
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_FA], stringList[INDEX_AR].numArToFa())
        }
    }

    // Test numFaToX functions
    @Test
    fun checkStringNumFaToEn() {
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_EN], stringList[INDEX_FA].numFaToEn())
        }
    }

    @Test
    fun checkStringNumFaToAr() {
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_AR], stringList[INDEX_FA].numFaToAr())
        }
    }
}
