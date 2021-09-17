package com.example.lesson25

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun onClik(view: View){
        val i = Intent()
        i.putExtra("key1", "Done")
        setResult(RESULT_OK, i)
        finish()
    }
}