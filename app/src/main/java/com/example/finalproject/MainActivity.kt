package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.finalproject.api.RedditApi
import com.example.finalproject.viewmodel.ImageViewModel
import kotlinx.coroutines.InternalCoroutinesApi

class MainActivity : AppCompatActivity() {
    lateinit var  imageViewModel : ImageViewModel
    @OptIn(InternalCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageViewModel = ImageViewModel()
        imageViewModel.setup("picture",0)

    }
}