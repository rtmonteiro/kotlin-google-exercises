package com.example.demo

class Person(
    val name: String,
    val age: Int,
    val hobby: String? = null,
    val referrer: Person? = null
) {

    fun showProfile(): String {

        val profile = StringBuffer()
        profile.append("Name: $name\n")
        profile.append("Age: $age\n")

        if (hobby != null) {
            profile.append("Likes to $hobby. ")
        }

        if (referrer != null) {
            profile.append("Has a referrer named ${referrer.name}")
            if (referrer.hobby != null) {
                profile.append(", who likes to ${referrer.hobby}.")
            } else {
                profile.append(".")
            }
        } else {
            profile.append("Doesn't have a referrer.")
        }

        return profile.toString()
    }

}
