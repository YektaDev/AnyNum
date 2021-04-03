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

class ShortTest {
    @Test
    fun testShortToArString() = numCases.forEach { Assertions.assertEquals(it.arNum, it.long.toShort().toArString()) }

    @Test
    fun testShortToFaString() = numCases.forEach { Assertions.assertEquals(it.faNum, it.long.toShort().toFaString()) }
}
