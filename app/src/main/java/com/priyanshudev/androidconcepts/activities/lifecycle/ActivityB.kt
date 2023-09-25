package com.priyanshudev.androidconcepts.activities.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.priyanshudev.androidconcepts.R
import com.priyanshudev.androidconcepts.utils.Logs

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        val button = findViewById<Button>(R.id.button2)
        Logs.d("Activity B  ON CREATE")
        button.setOnClickListener {
            val intent = Intent(this,ActivityC::class.java)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Logs.d("Activity B  ON START")
    }

    override fun onResume() {
        super.onResume()
        Logs.d("Activity B  ON RESUME")
    }

    override fun onPause() {
        super.onPause()
        Logs.d("Activity B  ON PAUSE")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Logs.d("Activity B  ON SAVE STATE")
    }

    override fun onStop() {
        super.onStop()
        Logs.d("Activity B  ON STOP")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Logs.d("Activity B  ON RESTORE STATE")
    }

    override fun onRestart() {
        super.onRestart()
        Logs.d("Activity B  ON RESTART")
    }

    override fun onDestroy() {
        super.onDestroy()
        Logs.d("Activity B  ON DESTROY")
    }
}