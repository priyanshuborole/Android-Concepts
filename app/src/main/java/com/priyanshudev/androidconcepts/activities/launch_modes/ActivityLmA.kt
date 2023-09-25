package com.priyanshudev.androidconcepts.activities.launch_modes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.priyanshudev.androidconcepts.R
import com.priyanshudev.androidconcepts.activities.lifecycle.ActivityC
import com.priyanshudev.androidconcepts.utils.Logs

class ActivityLmA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_a)
        val button = findViewById<Button>(R.id.btn_activity_lmA)
        Logs.d("Activity LM A  ON CREATE")
        button.setOnClickListener {
            val intent = Intent(this, ActivityLmB::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        Logs.d("Activity LM A  ON RESUME")
    }
}