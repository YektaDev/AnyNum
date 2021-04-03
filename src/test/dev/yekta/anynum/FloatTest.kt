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

class FloatTest {
    @Test
    fun testFloatToArString() =
        numCases.forEach { Assertions.assertEquals(it.arNum + arDecimalSuffix, it.long.toFloat().toArString()) }

    @Test
    fun testFloatToFaString() =
        numCases.forEach { Assertions.assertEquals(it.faNum + faDecimalSuffix, it.long.toFloat().toFaString()) }
}
