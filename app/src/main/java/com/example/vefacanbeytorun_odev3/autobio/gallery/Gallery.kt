package com.example.vefacanbeytorun_odev3.autobio.gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import com.example.vefacanbeytorun_odev3.R
import kotlinx.android.synthetic.main.activity_gallery.*

class Gallery : AppCompatActivity() {

    val detailService = DetailService()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        val customAdapter = GalleryAdapter(this,detailService.photoServices())
        custom_listview.adapter = customAdapter


    }
}