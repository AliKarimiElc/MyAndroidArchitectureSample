package com.example.myandroidarchitecturesample.features.featureOne

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myandroidarchitecturesample.R
import com.example.myandroidarchitecturesample.databinding.ActivityMainBinding
import com.example.myandroidarchitecturesample.pojos.User

class FeatureOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

        binding.user = User(1, "Ali","Karimi")

    }
}
