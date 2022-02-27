package com.hsg.calculatorinkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash_screen.*

class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        textView2.translationY = -1000f

        textView2.animate().translationY(0f).duration = 1000

        Handler().postDelayed(Runnable {

            startActivity(Intent(this, MainActivity::class.java))

        }, 3000)
        finish()
    }
}