package com.example.samplekotlinapp

import java.util.*

val strings = listOf(
    "Hello World!",
    "Hello Android!",
    "CS125 is Awesome!",
    "You pressed a button!",
    "Press that button again",
    "Having fun?",
    "I can do this aalllll day.",
    "Kotlin is Awesome!"
)

fun generateString(): String = strings[Random().nextInt(strings.size)]