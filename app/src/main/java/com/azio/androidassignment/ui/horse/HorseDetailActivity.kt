package com.azio.androidassignment.ui.horse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.azio.androidassignment.R

class HorseDetailActivity : AppCompatActivity() {

    private lateinit var binding : com.azio.androidassignment.databinding.ActivityHorseDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_horse_detail)


    }
}
