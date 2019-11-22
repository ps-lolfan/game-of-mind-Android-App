package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var res = 0;

        val btn1 = findViewById<Button>(R.id.b1);
        val btn2 = findViewById<Button>(R.id.b2);

        btn1.setOnClickListener{
            val i = Intent(this, second::class.java);
            i.putExtra("MY_KEY", 1);
            startActivity(i);
        }

        btn2.setOnClickListener{
            val i = Intent(this, second::class.java);
            i.putExtra("MY_KEY", 0);
            startActivity(i);
        }








    }
}

