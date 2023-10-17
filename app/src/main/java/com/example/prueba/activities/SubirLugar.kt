package com.example.prueba.activities

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
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

        val compressedByteArray = intent.getByteArrayExtra("imageByteArray")
        if (compressedByteArray != null) {
            val decodedBitmap = BitmapFactory.decodeByteArray(compressedByteArray, 0, compressedByteArray.size)
            val imageView = findViewById<ImageView>(R.id.imageView)
            imageView.setImageBitmap(decodedBitmap)
        }


    }


}