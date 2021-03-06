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
        assertEquals(1, vm.scoreTeamA.value)

        vm.updateTeamB()
        assertEquals(1, vm.scoreTeamB.value)
    }

    @Test
    fun testeReset(){
        val vm = getViewModel()
        vm.resetScores()

        assertEquals(0, vm.scoreTeamA.value)
        assertEquals(0, vm.scoreTeamB.value)
    }

    private fun getViewModel(): ScoreViewModel {
        val activity = Robolectric.setupActivity(MainActivity::class.java)
        return ViewModelProviders.of(activity).get(ScoreViewModel::class.java)
    }
}
