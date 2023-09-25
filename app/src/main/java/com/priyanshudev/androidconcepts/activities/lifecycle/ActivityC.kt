package com.priyanshudev.androidconcepts.activities.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.priyanshudev.androidconcepts.R
import com.priyanshudev.androidconcepts.utils.Logs

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        val button = findViewById<Button>(R.id.button3)
        Logs.d("Activity C  ON CREATE")
        button.setOnClickListener {
            val intent = Intent(this,ActivityA::class.java)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Logs.d("Activity C  ON START")
    }

    override fun onResume() {
        super.onResume()
        Logs.d("Activity C  ON RESUME")
    }

    override fun onPause() {
        super.onPause()
        Logs.d("Activity C  ON PAUSE")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Logs.d("Activity C  ON SAVE STATE")
    }

    override fun onStop() {
        super.onStop()
        Logs.d("Activity C  ON STOP")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Logs.d("Activity C  ON RESTORE STATE")
    }

    override fun onRestart() {
        super.onRestart()
        Logs.d("Activity C  ON RESTART")
    }

    override fun onDestroy() {
        super.onDestroy()
        Logs.d("Activity C  ON DESTROY")
    }
}