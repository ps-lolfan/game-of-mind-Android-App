package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fourth : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val btn1 = findViewById<Button>(R.id.b1);
        val btn2 = findViewById<Button>(R.id.b2);

        btn1.setOnClickListener{

            var number = intent.extras!!.getInt("MY_KEY");

            val i = Intent(this, fifth::class.java);
            number = number + 8;
            i.putExtra("MY_KEY", number);
            startActivity(i);
        }

        btn2.setOnClickListener{

            var number = intent.extras!!.getInt("MY_KEY");

            val i = Intent(this, fifth::class.java);
            number = number + 0;
            i.putExtra("MY_KEY", number);
            startActivity(i);
        }
    }
}
