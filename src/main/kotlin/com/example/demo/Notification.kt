package com.example.demo

class Notification {
    fun printNotificationSummary(numberOfMessages: Int): String {
        return if (numberOfMessages < 100) {
            "You have $numberOfMessages notifications."
        } else {
            "Your phone is blowing up! You have 99+ notifications."
        }
    }
}