package com.example.myandroidarchitecturesample.pojos

import java.io.Serializable

data class User(
    val id: Int? = null,
    val firstName: String? = null,
    val lastName: String? = null
) : Serializable