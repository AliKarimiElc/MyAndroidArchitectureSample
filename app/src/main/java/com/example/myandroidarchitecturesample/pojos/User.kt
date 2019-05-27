package com.example.myandroidarchitecturesample.pojos

import androidx.databinding.ObservableField

class User {
    var id = ObservableField<Int>()
    var firstName = ObservableField<String>()
    var lastName = ObservableField<String>()
}