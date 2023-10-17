package com.example.prueba.activities

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.prueba.R
import com.example.prueba.databinding.ActivitySubirLugarBinding

class SubirLugar : AppCompatActivity() {

    private lateinit var binding: ActivitySubirLugarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubirLugarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageView = findViewById<ImageView>(R.id.fotoSubida)

        val imageUriString = intent.getStringExtra("imageUri")
        if (imageUriString != null) {
            val imageUri = Uri.parse(imageUriString)
            val imageStream = contentResolver.openInputStream(imageUri)
            val decodedBitmap = BitmapFactory.decodeStream(imageStream)
            imageView.setImageBitmap(decodedBitmap)
        }


    }


}