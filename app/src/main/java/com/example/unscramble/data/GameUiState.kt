package com.example.unscramble.data

import kotlinx.coroutines.flow.MutableStateFlow

/**
 * Created by Javier J. Solis Flores on 12/10/24.
 * @email solis.unmsm@gmail.com
 * @github https://github.com/JavierSolis
 */
data class GameUiState(
    val currentScrambledWord: String = "",
    val isGuessedWordWrong: Boolean = false,
    val score: Int = 0,
    val currentWordCount: Int = 1,
    val isGameOver: Boolean = false
)

