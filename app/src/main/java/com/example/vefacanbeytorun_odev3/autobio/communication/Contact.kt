package com.example.vefacanbeytorun_odev3.autobio.communication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.vefacanbeytorun_odev3.R
import kotlinx.android.synthetic.main.activity_communication.*

class Contact : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_communication)

        txtInstaID.setOnClickListener (object : View.OnClickListener {
            override fun onClick(view: View) {
                val url = "https://www.instagram.com/vefa.can/"
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
        })

        txtTwitter.setOnClickListener (object : View.OnClickListener {
            override fun onClick(view: View) {
                val url = "https://twitter.com/Vefacaan"
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
        })

        txtLinkedin.setOnClickListener (object : View.OnClickListener {
            override fun onClick(view: View) {
                val url = "https://www.linkedin.com/in/vefacanbeytorun/"
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
        })

        txtMedium.setOnClickListener (object : View.OnClickListener {
            override fun onClick(view: View) {
                val url = "https://medium.com/@vefacanbeytorun"
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
        })



    }
}



