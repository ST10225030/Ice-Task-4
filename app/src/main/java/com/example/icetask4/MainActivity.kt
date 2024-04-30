package com.example.icetask4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.Arrays

// Teams from https://footballdatabase.com/ranking/south-africa/1
// retrieved on 21 May 2022
val teams = arrayOf<String>("Mamelodi Sundowns FC",
    "Bidvest Wits",
    "Orlando Pirates",
    "Kaizer Chiefs",
    "Cape Town City FC")

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get the teams text view
        val teamsTextView = findViewById<TextView>(R.id.teamsTextView)
// set the text view's text to the first team
        teamsTextView.text = teams[0]

        // change the value of element 0
        teams[0] = "Mamelodi Sundowns FC <3"

        // set the text view's text to the string representation of teams
        teamsTextView.text = Arrays.toString(teams)
    }

    }
}