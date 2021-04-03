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

class ByteTest {
    @Test
    fun testByteToArString() = numCases.forEach { Assertions.assertEquals(it.arNum, it.long.toByte().toArString()) }

    @Test
    fun testByteToFaString() = numCases.forEach { Assertions.assertEquals(it.faNum, it.long.toByte().toFaString()) }
}
