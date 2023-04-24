package com.example.vefacanbeytorun_odev3.autobio.gallery

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.vefacanbeytorun_odev3.R

class GalleryAdapter(private val context: Activity, private val list: List<PhotoDetail>):ArrayAdapter<PhotoDetail>(context, R.layout.custom_listview_gallery,list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val rootView = context.layoutInflater.inflate(R.layout.custom_listview_gallery,null,true)

        val gallery_image = rootView.findViewById<ImageView>(R.id.gallery_img)
        val gallery_title = rootView.findViewById<TextView>(R.id.gallery_title)
        val gallery_detail = rootView.findViewById<TextView>(R.id.gallery_detail)

        val user = list.get(position)


        Glide.with(context).load(user.photoURL).into(gallery_image)
        gallery_title.text = user.photoName
        gallery_detail.text = user.photoDetail




        return rootView
    }




}