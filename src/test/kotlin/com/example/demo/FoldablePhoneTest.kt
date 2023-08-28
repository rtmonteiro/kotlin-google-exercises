package com.example.demo

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class FoldablePhoneTest {

    @Test
    fun `should switch on the phone when screen is not folded`() {
        val foldablePhone = FoldablePhone()
        foldablePhone.switchOn()
        assertTrue(foldablePhone.isScreenLightOn)
    }

    @Test
    fun `should not switch on the phone when screen is not folded`() {
        val foldablePhone = FoldablePhone()
        foldablePhone.switchOn()
        assertFalse(foldablePhone.isScreenLightOn)
    }
}