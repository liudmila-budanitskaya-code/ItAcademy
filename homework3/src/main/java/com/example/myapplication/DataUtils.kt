package com.example.myapplication

class DataUtils {
    companion object {
        var counter = 1
        var resultScore = 0

        fun generateQuiz(): HashMap<Int, QuizItem> {
            return hashMapOf(
                1 to QuizItem(
                    "Есть стопка монет высотой с Эйфелеву башню. Поместятся ли эти монеты в вашей комнате?",
                    true
                ),
                2 to QuizItem("Правда ли, что Земля падает на Солнце?", true),
                3 to QuizItem(
                    "Правда ли, что язык программирования Kotlin назван в честь острова в Персидском заливе?",
                    false
                ),
                4 to QuizItem(
                    "Верно ли утверждение, что Python является статически типизированным языком программирования, а Kotlin - динамически типизированным?",
                    false
                ),
                5 to QuizItem(
                    "Действительно ли в языке программирования Kotlin нет проверяемых исключений?",
                    true
                ),
                6 to QuizItem(
                    "Если в 12 часов ночи идёт дождь, то можно ли ожидать, что через 72 часа будет светить солнце?",
                    false
                ),
                7 to QuizItem(
                    "Правда ли, что в США официальный государственный язык - английский?",
                    false
                )
            )
        }
    }
}

