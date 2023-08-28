package com.example.demo

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test


class SongTest {
    @Test
    fun `should print song info`() {
        val song = Song(
            title = "Astronomia",
            artist = "Vicetone & Tony Igy",
            releaseYear = 2014,
            countPlays = 1_000_000,
        )

        assertEquals("Astronomia, de Vicetone & Tony Igy, lançado em 2014.",
            song.printDescription())
        assertTrue(song.isPopular)
    }
}