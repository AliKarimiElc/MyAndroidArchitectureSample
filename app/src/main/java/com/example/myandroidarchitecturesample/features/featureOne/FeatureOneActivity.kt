package com.example.myandroidarchitecturesample.features.featureOne

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.myandroidarchitecturesample.R
import com.example.myandroidarchitecturesample.databinding.ActivityMainBinding
import com.example.myandroidarchitecturesample.pojos.User
import kotlinx.android.synthetic.main.activity_main.*

class FeatureOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)
        val user = User().apply {
            firstName.set("Ali")
            lastName.set("Karimi")
            id.set(1)
        }
        binding.user = user


        button2.setOnClickListener {
            user.firstName.set("Reza")
        }

    }
}
