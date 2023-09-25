package com.priyanshudev.androidconcepts.activities.launch_modes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.priyanshudev.androidconcepts.R
import com.priyanshudev.androidconcepts.utils.Logs

class ActivityLmC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lm_c)
        val button = findViewById<Button>(R.id.btn_activity_lmC)
        val button2 = findViewById<Button>(R.id.btn_activity_lmC2)
        Logs.d("Activity LM C  ON CREATE")
        button.setOnClickListener {
            val intent = Intent(this, ActivityLmA::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP + Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, ActivityLmC::class.java).apply {
                //Single Top
                addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
                //If enabled then A->B->C and opened C again then onNewIntent() method will be called following onResume.
                //If disabled then A->B->C and opened C again then new instance of C  (A->B->C->C) will be called following onCreate and onResume.

            }
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        Logs.d("Activity LM C  ON RESUME")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Logs.d("Activity LM C  ON NEW INTENT  -  $intent")

    }

}