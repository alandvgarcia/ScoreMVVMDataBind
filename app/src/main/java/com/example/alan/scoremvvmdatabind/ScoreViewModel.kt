package com.example.alan.scoremvvmdatabind

import android.arch.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {
    var score = Score()

    fun updateTeamA() {
        score.teamA++
    }

    fun updateTeamB() {
        score.teamB++
    }

    fun resetScores() {
        score.teamA = 0
        score.teamB = 0
    }

}