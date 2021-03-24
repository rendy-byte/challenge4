package com.example.myapplication

class Controller(private val callback: Callback) {
    fun bandingkanNumbers(player1: Int, player2: Int) {
        val status = when {
            player1 == (1) && player2 == (0) ||
                    player1 == (2) && player2 == (0) ||
                    player1 == (2) && player2 == (1)  -> "Player 1 Winner"

            player1 == (0) && player2 == (1) ||
                    player1 == (0) && player2 == (2) ||
                    player1 == (1) && player2 == (2)  -> "Player 2 Winner"

            else -> "Draw"
        }

        callback.kirimStatus(status)
    }
}