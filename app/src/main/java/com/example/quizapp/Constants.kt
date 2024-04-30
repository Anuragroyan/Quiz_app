package com.example.quizapp

object Constants {
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestion():ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1, "Which scientist invented electric bulb in 1879?",
            R.drawable.thomas_edison,
            "Marie Curie","Thomas Edison",
            "Issac Newton","Charles Darwin",
            2
        )
        questionsList.add(que1)
        val que2 = Question(
            2, "Which scientist discovered radioactivity and open new avenues for medical treatment ,scientific research in nuclear science and technology?",
            R.drawable.marie_curie,
            "Marie Curie","Nicola Tesla",
            "Issac Newton","Charles Darwin",
            1
        )
        questionsList.add(que2)
        val que3 = Question(
            3, "Which scientist invented a device for communication in 1876?",
            R.drawable.alexander_graham_bell,
            "Galileo Galilei","Charles Darwin",
            "Issac Newton","Alexander Graham Bell",
            4
        )
        questionsList.add(que3)
        val que4 = Question(
            4, "Which scientist major contributions reshaped our understanding of space, time, gravity, " +
                    "and the nature of matter and energy, laying the foundation for many advancements in physics?",
            R.drawable.albert_einstein,
            "Marie Curie","Thomas Edison",
            "Albert Einstein","Charles Darwin",
            3
        )
        questionsList.add(que4)
        val que5 = Question(
            5, "Which scientist contributions to mathematics and physics revolutionized scientific thinking " +
                    "and paved the way for many subsequent developments in science and technology?",
            R.drawable.issac_newton,
            "Issac Newton","James Clerk Maxwell:",
            "Rosalind Franklin","Charles Darwin",
            1
        )
        questionsList.add(que5)
        val que6 = Question(
            6, "Which scientist influence modern technology, especially in electrical engineering, power distribution, wireless communication, and electromechanical devices?",
            R.drawable.nikola_tesla,
            "Marie Curie","Thomas Edison",
            "Issac Newton","Nikola Tesla",
            4
        )
        questionsList.add(que6)
        val que7 = Question(
            7, "Which scientist find theory of evolution transformed our grasp of life's diversity, change over time, and interconnectedness. It's a foundation in modern biology," +
                    " guiding ongoing scientific exploration and understanding?",
            R.drawable.charles_darwin,
            "Marie Curie","Thomas Edison",
            "Charles Darwin","Issac Newton",
            3
        )
        questionsList.add(que7)
        val que8 = Question(
            8, "Which scientist contributions challenged beliefs with evidence for a heliocentric universe, advanced motion understanding, " +
                    "and promoted experimental observation in science, shaping modern astronomy and physics?",
            R.drawable.galileo_galilei,
            "Galileo Galilei","Thomas Edison",
            "Issac Newton","Charles Darwin",
            1
        )
        questionsList.add(que8)
        val que9 = Question(
            9, "Which scientist formulating Maxwell's equations and predicting electromagnetic waves played a pivotal role in the development of modern telecommunications and electromagnetic technologies?",
            R.drawable.james_clerk_maxwell,
            "Marie Curie","James Clerk Maxwell",
            "Issac Newton","Rosalind Franklin",
            2
        )
        questionsList.add(que9)
        val que10 = Question(
            10, "Which scientist discovers contributions to the study of DNA's structure?",
            R.drawable.rosalind_franklin,
            "Marie Curie","Thomas Edison",
            "James Clerk Maxwell","Rosalind Franklin",
            4
        )
        questionsList.add(que10)
        return questionsList
    }
}