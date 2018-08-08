package com.example.alan.scoremvvmdatabind

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.alan.scoremvvmdatabind.databinding.MainactivityBinding
import kotlinx.android.synthetic.main.mainactivity.*

class MainActivity : AppCompatActivity() {

    private val binding: MainactivityBinding? by lazy { DataBindingUtil.bind<MainactivityBinding>(viewRoot) }
    private val viewModel: ScoreViewModel by lazy { ViewModelProviders.of(this).get(ScoreViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity)

        binding?.score = viewModel.score

        buttonTeamA.setOnClickListener { viewModel.updateTeamA() }
        buttonTeamB.setOnClickListener { viewModel.updateTeamB() }
        buttonReset.setOnClickListener { viewModel.resetScores() }


    }
}
