package com.example.demo

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NotificationTest {
    @Test
    fun `Notification when less than 99 messages`() {
        val notification = Notification()
        val summary = notification.printNotificationSummary(51)
        assertEquals( "You have 51 notifications.", summary)
    }

    @Test
    fun `Notification when more than 99 messages`() {
        val notification = Notification()
        val summary = notification.printNotificationSummary(135)
        assertEquals( "Your phone is blowing up! You have 99+ notifications.", summary)
    }
}