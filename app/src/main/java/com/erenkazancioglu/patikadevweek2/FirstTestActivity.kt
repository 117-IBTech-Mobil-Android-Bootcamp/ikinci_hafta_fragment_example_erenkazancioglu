package com.erenkazancioglu.patikadevweek2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FirstTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_test)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val firstTestFragment = FirstTestFragment()
        fragmentTransaction.replace(R.id.first_test_activity_layout,firstTestFragment).commit()
    }
}