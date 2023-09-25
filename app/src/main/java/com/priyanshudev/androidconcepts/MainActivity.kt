package com.priyanshudev.androidconcepts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.priyanshudev.androidconcepts.utils.Logs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logs.d("on create")
    }

    override fun onStart() {
        super.onStart()
        Logs.d("on start")
    }

    override fun onResume() {
        super.onResume()
        Logs.d("on resume")
    }

    override fun onPause() {
        super.onPause()
        Logs.d("on pause")
    }

    override fun onStop() {
        super.onStop()
        Logs.d("on stop")
    }

    override fun onRestart() {
        super.onRestart()
        Logs.d("on restart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Logs.d("on save state")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Logs.d("on restore state")
    }

    override fun onDestroy() {
        super.onDestroy()
        Logs.d("on destroy")
    }
}