package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        toast("Test custom toast.")
    }
}