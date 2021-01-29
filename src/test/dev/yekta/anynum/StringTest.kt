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
    @Test
    fun testStringNumToEn() {
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_EN], stringList[INDEX_MIXED].numToEn())
        }
    }

    @Test
    fun checkStringNumToAr() {/*
        strings.forEach { stringList ->
            assertEquals(stringList[INDEX_MIXED].numToEn(), stringList[INDEX_AR])
        }*/
    }

    @Test
    fun checkStringNumToFa() {
        // TODO: Implement the function
    }

    @Test
    fun checkStringNumEnToAr() {
        // TODO: Implement the function
    }

    @Test
    fun checkStringNumEnToFa() {
        // TODO: Implement the function
    }

    @Test
    fun checkStringNumArToEn() {
        // TODO: Implement the function
    }

    @Test
    fun checkStringNumArToFa() {
        // TODO: Implement the function
    }

    @Test
    fun checkStringNumFaToEn() {
        // TODO: Implement the function
    }

    @Test
    fun checkStringNumFaToAr() {
        // TODO: Implement the function
    }
}
