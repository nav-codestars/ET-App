package com.example.emergingtechnology

import androidx.annotation.DrawableRes

data class Technology(
    val id: Int,
    val name: String,
    @DrawableRes val picId: Int,
    val description: String,
    val languages: List<String>
)

val technologies = listOf(
    Technology(
        1,
        "Android",
        R.drawable.android,
        "Android is a mobile operating system developed by Google.",
        listOf("Java", "Kotlin")
    ),
    Technology(
        2,
        "iOS",
        R.drawable.ios,
        "iOS is a mobile operating system developed by Apple.",
        listOf("Swift", "Objective-C")
    ),
    Technology(
        3,
        "Machine Learning",
        R.drawable.ml,
        "Machine learning is a subfield of artificial intelligence that provides systems the ability to automatically learn and improve from experience without being explicitly programmed.",
        listOf("Python")
    ),
    Technology(
        4,
        "Blockchain",
        R.drawable.blockchain,
        "Blockchain is a distributed ledger technology that facilitates the creation, sharing, and verification of data.",
        listOf("Java", "Kotlin")
    )
)