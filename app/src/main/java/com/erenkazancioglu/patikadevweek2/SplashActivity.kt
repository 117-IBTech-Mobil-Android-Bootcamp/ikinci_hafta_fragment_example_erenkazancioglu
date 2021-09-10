package com.erenkazancioglu.patikadevweek2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Timer().schedule(object : TimerTask() {
            override fun run() {
                startActivity<FirstTestActivity>{
                    //if send information other activity
                    //write some codes here exp: intent.putExtra(K,V)
                }
                finish()
            }
        }, SPLASH_TIME_OUT)
    }

}