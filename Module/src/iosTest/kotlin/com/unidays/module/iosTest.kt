package com.unidays.module

import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Example().hello().contains("Hello"), "Check iOS is mentioned")
    }
}