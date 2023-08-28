package com.example.demo

class Ticket {
    fun ticketPrice(age: Int, isMonday: Boolean): Int {
        return when(age) {
            in 0..12 -> 15
            in 13..60 -> if (isMonday) 25 else 30
            in 61..100 -> 20
            else -> -1
        }
    }
}