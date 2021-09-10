package com.erenkazancioglu.patikadevweek2

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import douglasspgyn.com.github.circularcountdown.CircularCountdown
import douglasspgyn.com.github.circularcountdown.listener.CircularListener
import kotlinx.android.synthetic.main.activity_word_test.*
import kotlinx.android.synthetic.main.activity_word_test.view.*

class WordTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_test)

        val intent = intent
        val question =  intent.getStringExtra("Question")
        question_text.text=question
        val answers = intent.getSerializableExtra("Answers") as ArrayList<String>
        info_text.text = answers[0]
        info_text_2.text = answers[1]
        info_text_3.text = answers[2]
        info_text_4.text = answers[3]

        circularCountdown.create(1, TIME_COUNTER, CircularCountdown.TYPE_SECOND)
            .listener(object : CircularListener {
                override fun onTick(progress: Int) {
                    if (progress == TIME_COUNTER) {
                        circularCountdown.stop()
                    }
                }
                override fun onFinish(newCycle: Boolean, cycleCount: Int) {
                }
            })
            .start()

        var myProgressBar : ProgressBar
        var myCountTimer : CountDownTimer
        var i : Int = 0
        myProgressBar = horizontalProgressbar
        myProgressBar.setProgress(i)

        myCountTimer = object : CountDownTimer(20000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                i++
                myProgressBar.setProgress(i * 25 / (5000/ 1000))
            }
            override fun onFinish() {
            }
        }
        myCountTimer.start()
    }
}