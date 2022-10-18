package com.example.kt_quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

class ResultActivity : AppCompatActivity() {


    var tvUsername: TextView? = null
    var tvScore: TextView? = null
    var btnFinish: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        btnFinish = findViewById(R.id.btn_finish)
        tvScore = findViewById(R.id.tv_score)
        tvUsername = findViewById(R.id.tv_username)


        tvUsername?.text = intent.getStringExtra(Constants.USER_NAME);

        val score = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0);
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0);



        tvScore?.text = "Your Score is $score out of $totalQuestions"


        btnFinish?.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java));

        }

    }


}