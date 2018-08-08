package com.example.alan.scoremvvmdatabind

import android.arch.lifecycle.ViewModelProviders
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

@RunWith(RobolectricTestRunner::class)
class ExampleUnitTest {
    @Test
    fun testeChangeScore() {
        val vm = getViewModel()

        vm.updateTeamA()
        assertEquals(1, vm.score.teamA)

        vm.updateTeamB()
        assertEquals(1, vm.score.teamB)
    }

    @Test
    fun testeReset(){
        val vm = getViewModel()
        vm.resetScores()

        assertEquals(0, vm.score.teamA)
        assertEquals(0, vm.score.teamB)
    }

    private fun getViewModel(): ScoreViewModel {
        val activity = Robolectric.setupActivity(MainActivity::class.java)
        return ViewModelProviders.of(activity).get(ScoreViewModel::class.java)
    }
}
