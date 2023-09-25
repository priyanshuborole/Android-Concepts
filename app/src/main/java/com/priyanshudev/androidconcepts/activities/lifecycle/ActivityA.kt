package com.priyanshudev.androidconcepts.activities.lifecycle

import android.Manifest
import android.app.DatePickerDialog
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.priyanshudev.androidconcepts.R
import com.priyanshudev.androidconcepts.utils.Logs
import java.util.Calendar

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        val button = findViewById<Button>(R.id.button)
        val btn_alert_dialog = findViewById<Button>(R.id.btn_alert_dialog)
        Logs.d("Activity A  ON CREATE")
        //In the onCreate() method, perform basic application startup logic that happens only once for the entire life of the activity.

        button.setOnClickListener {
            val intent = Intent(this,ActivityB::class.java)
            startActivity(intent)
            //finish()  --> this will remove the current activity ie A from the back stack
        }

        btn_alert_dialog.setOnClickListener {
            // do not pause the activity
            val alertDialogBuilder = AlertDialog.Builder(this)
            alertDialogBuilder.setTitle("Alert Dialog")
            alertDialogBuilder.setMessage("This is a simple alert dialog")

            alertDialogBuilder.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, _ ->
                dialog.dismiss()
            })

            val alertDialog = alertDialogBuilder.create()
            alertDialog.show()
        }

    }

    override fun onStart() {
        super.onStart()
        Logs.d("Activity A  ON START")
        //This call makes the activity visible to the user as the app prepares for the activity to enter the foreground and become interactive.
        // For example, this method is where the code that maintains the UI is initialized.
    }

    override fun onResume() {
        super.onResume()
        Logs.d("Activity A  ON RESUME")
        //This is the state in which the app interacts with the user. The app stays in this state until something happens to take focus away from the app,
        // such as the device receiving a phone call, the user navigating to another activity, or the device screen turning off.
    }

    override fun onPause() {
        super.onPause()
        Logs.d("Activity A  ON PAUSE")
        //The system calls this method as the first indication that the user is leaving your activity, though it does not always mean the activity is being destroyed.
        // It indicates that the activity is no longer in the foreground, but it is still visible if the user is in multi-window mode.
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Logs.d("Activity A  ON SAVE STATE")
        //system calls the onSaveInstanceState() method so your activity can save state information to an instance state bundle.
        // The default implementation of this method saves transient information about the state of the activity's view hierarchy,
        // such as the text in an EditText widget or the scroll position of a ListView widget.
    }

    override fun onStop() {
        super.onStop()
        Logs.d("Activity A  ON STOP")
        //When your activity is no longer visible to the user, it enters the Stopped state, and the system invokes the onStop() callback.
        // This can occur when a newly launched activity covers the entire screen. The system also calls onStop() when the activity finishes running and is about to be terminated.
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Logs.d("Activity A  ON RESTORE STATE")
        //When your activity is recreated after it was previously destroyed,
        // you can recover your saved instance state from the Bundle that the system passes to your activity.
        // Both the onCreate() and onRestoreInstanceState() callback methods receive the same Bundle that contains the instance state information.
    }

    override fun onRestart() {
        super.onRestart()
        Logs.d("Activity A  ON RESTART")
    }

    override fun onDestroy() {
        super.onDestroy()
        Logs.d("Activity A  ON DESTROY")
        //The activity is finishing, due to the user completely dismissing the activity or due to finish() being called on the activity.
        //The system is temporarily destroying the activity due to a configuration change, such as device rotation or entering multi-window mode.
    }

    override fun onRequestPermissionsResult(requestCode: Int,
                                            permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == 101) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted, you can proceed with the action
            } else {
                // Permission denied, handle accordingly
            }
        }
    }

}