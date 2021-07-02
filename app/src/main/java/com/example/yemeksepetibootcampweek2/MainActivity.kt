package com.example.yemeksepetibootcampweek2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var getStartedButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        addListeners()
    }

    private fun initViews() {
        getStartedButton = findViewById(R.id.getStartedButton)
    }

    private fun addListeners() {
        getStartedButton.setOnClickListener {
            navigateToSignUp()
        }
    }

    private fun navigateToSignUp() {
        val intentSignUp = Intent(this, SignUpActivity::class.java)
        startActivity(intentSignUp)
    }
}