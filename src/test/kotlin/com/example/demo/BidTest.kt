package com.example.demo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BidTest {
    @Test
    fun `should show the minimun bid`() {
        val bid = Bid(5000, "Private Collector")
        assertEquals(5000,
            auctionPrice(bid, 2000))
    }

    @Test
    fun `should show the bid amount`() {
        val bid = null
        assertEquals(3000,
            auctionPrice(bid, 3000))
    }
}