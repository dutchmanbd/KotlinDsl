package com.ticonsys.kotlindsl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ticonsys.kotlindsl.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvAppName.setText(R.string.app_name)
        binding.tvLibraryName.setText(R.string.utilities)
    }
}