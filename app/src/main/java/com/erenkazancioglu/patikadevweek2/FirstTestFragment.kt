package com.erenkazancioglu.patikadevweek2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first_test.*

class FirstTestFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_start_now.setOnClickListener { startnow(view) }
        button_start_now.setOnClickListener(View.OnClickListener { startnow(view) })

    }
    fun startnow (view: View){
        val answerList = arrayListOf<String>("Görselleştirmek","Altında","Bağış","Ensülin")
        val intent = Intent(activity, WordTestActivity::class.java)
        intent.putExtra("Question","Visualize")
        intent.putStringArrayListExtra("Answers",  answerList)
        startActivity(intent)
    }

}