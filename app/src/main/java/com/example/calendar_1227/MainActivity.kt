package com.example.calendar_1227

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import com.example.calendar_1227.Calendar.calendar
import com.example.calendar_1227.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding:ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
    private lateinit var _calendar: calendar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //_calendar = binding.calendar
    }
}