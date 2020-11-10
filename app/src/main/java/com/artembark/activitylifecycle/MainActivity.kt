package com.artembark.activitylifecycle

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext, "onCreate()", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "onStart()", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext, "onRestart()", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "onResume()", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        Toast.makeText(applicationContext, "onPause()", Toast.LENGTH_SHORT).show()
        super.onPause()
    }

    override fun onStop() {
        Toast.makeText(applicationContext, "onStop()", Toast.LENGTH_SHORT).show()
        super.onStop()
    }

    override fun onDestroy() {
        Toast.makeText(applicationContext, "onDestroy()", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }
}