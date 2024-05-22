package com.ash.rts.idea.model

import com.ash.rts.ideal.com.ash.rts.idea.model.rollD12
import com.ash.rts.ideal.com.ash.rts.idea.model.rollD20
import com.ash.rts.ideal.com.ash.rts.idea.model.rollD6
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.RepeatedTest

class RollKtTest {

    @RepeatedTest(100)
    fun testRollD20() {
        val rollD20 = rollD20()
        assertTrue(rollD20 in 1..20) { "Should Only return whole number between 1 and 20 WAS $rollD20"}
    }

    @RepeatedTest(100)
    fun testRollD12() {
        val rollD12 = rollD12()
        assertTrue(rollD12 in 1..12) { "Should Only return whole number between 1 and 12 WAS $rollD12"}
    }

    @RepeatedTest(100)
    fun testRollD6() {
        val rollD6 = rollD6()
        assertTrue(rollD6 in 1..6) { "Should Only return whole number between 1 and 6 WAS $rollD6"}
    }
}