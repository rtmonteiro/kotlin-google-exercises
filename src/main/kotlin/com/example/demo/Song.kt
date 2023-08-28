package com.example.demo

class Song(
    val title: String,
    val artist: String,
    val releaseYear: Int,
    val countPlays: Int,
) {

    val isPopular: Boolean
        get() = countPlays > 1_000

    fun printDescription(): String {
        return "$title, de $artist, lançado em $releaseYear."
    }
}