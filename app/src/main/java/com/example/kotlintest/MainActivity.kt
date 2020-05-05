package com.example.kotlintest

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.MutableInt
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

   var answers : Int = 0

 class MainActivity : AppCompatActivity() {

     @SuppressLint("SetTextI18n")
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

         answer.text = ""

         add.setOnClickListener {
             val fnum: String = firstnumber.text.toString()
             val snum: String = secondnumber.text.toString()

             if (fnum.isEmpty() || snum.isEmpty()) {
                 answer.text = "Input a Number"
             } else {
                 answers = fnum.toInt() + snum.toInt()
                 answer.text = answers.toString()
             }
         }


             sub.setOnClickListener {
                 val fnum: String = firstnumber.text.toString()
                 val snum: String = secondnumber.text.toString()

                 if (fnum.isEmpty() || snum.isEmpty()) {
                     answer.text = "Input a Number"
                 } else {
                     answers = fnum.toInt() - snum.toInt()
                     answer.text = answers.toString()
                 }
             }


                 div.setOnClickListener {
                     val fnum: String = firstnumber.text.toString()
                     val snum: String = secondnumber.text.toString()

                     if (fnum.isEmpty() || snum.isEmpty()) {
                         answer.text = "Input a Number"
                     } else {
                         answers = fnum.toInt() / snum.toInt()
                         answer.text = answers.toString()
                     }

                 }

                     mul.setOnClickListener {
                         val fnum: String = firstnumber.text.toString()
                         val snum: String = secondnumber.text.toString()

                         if (fnum.isEmpty() || snum.isEmpty()) {
                             answer.text = "Input a Number"
                         } else {
                             answers = fnum.toInt() * snum.toInt()
                             answer.text = answers.toString()
                         }
                     }
     }


 }





