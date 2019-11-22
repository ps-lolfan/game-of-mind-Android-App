package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class homepage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)





        setContentView(R.layout.activity_homepage)

        val btn1 = findViewById<Button>(R.id.button);

        btn1.setOnClickListener{
            val i = Intent(this, MainActivity::class.java);

            startActivity(i);
        }

    }
    override fun onBackPressed() {
        val i = Intent(this, homepage::class.java);
        startActivity(i);
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
