package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class fini : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fini)

        val btn1 = findViewById<Button>(R.id.button2);
        val btn2 = findViewById<Button>(R.id.button3);

        var bbb = findViewById<TextView>(R.id.textView3);
        var number = intent.extras!!.getInt("MY_KEY");
        var n = Integer.toString(number);
        bbb.setText(n);

        btn1.setOnClickListener{

            val i = Intent(this, homepage::class.java);
            startActivity(i);
        }

        btn2.setOnClickListener{
            val i = Intent(this, homepage::class.java);
            startActivity(i);
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
           // System.exit(1);
        }
    }

    override fun onBackPressed() {
        val i = Intent(this, homepage::class.java);
        startActivity(i);
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
