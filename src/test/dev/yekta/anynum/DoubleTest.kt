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

class DoubleTest {
    @Test
    fun testDoubleToArString() =
        numCases.forEach { Assertions.assertEquals(it.arNum + arDecimalSuffix, it.long.toDouble().toArString()) }

    @Test
    fun testDoubleToFaString() =
        numCases.forEach { Assertions.assertEquals(it.faNum + faDecimalSuffix, it.long.toDouble().toFaString()) }
}
