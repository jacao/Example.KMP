package com.unidays.module

import kotlin.test.Test
import kotlin.test.assertTrue

class CommonGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Example().hello().contains("Hello"), "Check 'Hello' is mentioned")
    }
}