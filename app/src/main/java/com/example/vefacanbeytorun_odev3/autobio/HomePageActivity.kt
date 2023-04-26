package com.example.vefacanbeytorun_odev3.autobio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vefacanbeytorun_odev3.R
import com.example.vefacanbeytorun_odev3.autobio.aboutme.AboutMe
import com.example.vefacanbeytorun_odev3.autobio.blog.Blog
import com.example.vefacanbeytorun_odev3.autobio.communication.Contact
import com.example.vefacanbeytorun_odev3.autobio.gallery.Gallery
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
            startActivity(Intent(this, Contact::class.java))
        }

        btnBlog.setOnClickListener {
            startActivity(Intent(this, Blog::class.java))
        }
    }
}