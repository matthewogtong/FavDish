package com.matthewogtong.favdish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.matthewogtong.favdish.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val splashBinding by lazy { ActivitySplashBinding.inflate(layoutInflater) }
        setContentView(splashBinding.root)

    }
}