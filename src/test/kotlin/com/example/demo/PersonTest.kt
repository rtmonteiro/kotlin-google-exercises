package com.example.demo

import org.junit.jupiter.api.Assertions
import kotlin.test.Test

class PersonTest {

    val amanda = Person(
        name = "Amanda",
        age = 33,
        hobby = "play tennis",
        referrer = null,
    )

    val atiqah = Person(
        name = "Atiqah",
        age = 28,
        hobby = "climb",
        referrer = amanda,
    )

    @Test
    fun `should print person info`() {
        Assertions.assertLinesMatch(
            listOf(
                "Name: Amanda",
                "Age: 33",
                "Likes to play tennis. Doesn't have a referrer.",
            ),
            amanda.showProfile().lines(),
        )
    }

    @Test
    fun `should print person info with referrer`() {
        Assertions.assertLinesMatch(
            listOf(
                "Name: Atiqah",
                "Age: 28",
                "Likes to climb. Has a referrer named Amanda, who likes to play tennis.",
            ),
            atiqah.showProfile().lines(),
        )
    }
}