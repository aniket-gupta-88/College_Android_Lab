package com.example.exp2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private var FontSize = 24f;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val btn = findViewById<FloatingActionButton>(R.id.floatingActionButton1)
        val btn1 = findViewById<FloatingActionButton>(R.id.floatingActionButton2)
        val btn2 = findViewById<TextView>(R.id.textView)
         btn.setOnClickListener {
             FontSize += 3f
             btn2.setTextSize(TypedValue.COMPLEX_UNIT_SP,FontSize)
             btn2.setTextColor(Color.parseColor("#DDBBFF"))
         }
         btn1.setOnClickListener {
             FontSize -= 3f
             btn2.setTextSize(TypedValue.COMPLEX_UNIT_SP,FontSize)
             btn2.setTextColor(Color.parseColor("#AAACCC"))
         }
    }

}