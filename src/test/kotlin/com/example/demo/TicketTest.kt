package com.example.demo

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TicketTest {

    @Test
    fun `ticket when 12 years `() {
        assertEquals(5,
            Ticket().ticketPrice(12, false))
    }

    @Test
    fun `ticket when 20 years`() {
        assertEquals(30,
            Ticket().ticketPrice(20, false))
    }

    @Test
    fun `ticket when 20 years and is Monday`() {
        assertEquals(25,
            Ticket().ticketPrice(20, true))
    }

    @Test
    fun `ticket when 62 years`() {
        assertEquals(20,
            Ticket().ticketPrice(62, false))
    }

    @Test
    fun `ticket when 101 years`() {
        assertEquals(-1,
            Ticket().ticketPrice(101, false))
    }
}