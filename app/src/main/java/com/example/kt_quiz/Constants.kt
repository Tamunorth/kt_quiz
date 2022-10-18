package com.example.kt_quiz

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question> {


        return arrayListOf(


            Question(
                id = 1,
                "What country does this flag belong to ?",
                R.drawable.ic_flag_of_argentina,
                "Argentina",
                "Armenia",
                "Egypt",
                "Nigeria",
                1,
            ),
            Question(
                id = 2,
                "What country does this flag belong to ?",
                R.drawable.ic_flag_of_brazil,
                "Brazil",
                "Armenia",
                "Egypt",
                "Nigeria",
                1,
            ),
            Question(
                id = 3,
                "What country does this flag belong to ?",
                R.drawable.ic_flag_of_denmark,
                "Denmark",
                "Armenia",
                "Egypt",
                "Nigeria",
                1,
            )


        )
    }
}