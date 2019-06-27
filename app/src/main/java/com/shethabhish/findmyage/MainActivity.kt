package com.shethabhish.findmyage

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* we can actually assign the button action here using onClick, but if we have many buttons there will be many
        lot of code inside the oncreate, so its better to create a seperate fun for the button using the name that
        we set in the Onclick attribute of the button*/
        }

    fun clickBtn(view: View) {
        // this part of code will be operated when anyone clicks the button
        val year = yearTxt.text.toString().toInt()
        // the yearTxt field contains text format so we convert it into string first and then into integer
        val currentyear = Calendar.getInstance().get(Calendar.YEAR) // to get current year

        if (year < currentyear && year > 999) {
            var find = currentyear - year
            ageTxt.text = "Your age is $find"
        } else {
            ageTxt.text = "Enter a valid year"
        }
    }
}
