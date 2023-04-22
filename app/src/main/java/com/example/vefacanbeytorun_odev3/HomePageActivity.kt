package com.example.vefacanbeytorun_odev3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        btnHakkimda.setOnClickListener {
            startActivity(Intent(this, AboutMe::class.java))
        }

        btnGaleri.setOnClickListener {
            startActivity(Intent(this, Gallery::class.java))
        }

        btnIletisim.setOnClickListener {
            startActivity(Intent(this, Communication::class.java))
        }

        btnBlog.setOnClickListener {
            startActivity(Intent(this, Blog::class.java))
        }
    }
}