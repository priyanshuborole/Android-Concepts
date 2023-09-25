package com.priyanshudev.androidconcepts.activities.launch_modes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.priyanshudev.androidconcepts.R
import com.priyanshudev.androidconcepts.utils.Logs

class ActivityLmB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_b)
        val button = findViewById<Button>(R.id.btn_activity_lmB)
        Logs.d("Activity LM B  ON CREATE")
        button.setOnClickListener {
            val intent = Intent(this, ActivityLmC::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        Logs.d("Activity LM B  ON RESUME")
    }
}