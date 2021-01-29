/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.anynum

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LongTest {
    @Test
    fun testLongToArString() {
        numbers.forEach { longStringListPair ->
            val long = longStringListPair.first
            val expectedStr = longStringListPair.second[INDEX_NUMBERS_FA]

            Assertions.assertEquals(expectedStr, long.toFaString())
        }
    }

    @Test
    fun testLongToFaString() {
        numbers.forEach { longStringListPair ->
            val long = longStringListPair.first
            val expectedStr = longStringListPair.second[INDEX_NUMBERS_FA]

            Assertions.assertEquals(expectedStr, long.toFaString())
        }
    }
}
