package com.tahayasinf.kflidreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import com.google.firebase.database.FirebaseDatabase
import com.tahayasinf.kflidreader.databinding.ActivityMainBinding
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var database = FirebaseDatabase.getInstance().reference

        //Adding Info To DB
        binding.sendbutton.setOnClickListener {
            var std_fingerprintID = binding.fingerprintID.text.toString().toInt()
            var std_nameAndSurname = binding.nameAndSurname.text.toString()
            var std_datetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))
            //database.setValue(StudentInfo(std_fingerprintID, std_nameAndSurname, std_datetime))
            database.child(std_nameAndSurname.toString()).setValue(StudentInfo(std_datetime, std_fingerprintID))
        }


        }

    }
