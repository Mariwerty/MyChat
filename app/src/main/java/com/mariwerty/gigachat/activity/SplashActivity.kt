package com.mariwerty.gigachat.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.mariwerty.gigachat.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    override fun onResume() {
        super.onResume()
        FirebaseAuth.getInstance().currentUser
        if (FirebaseAuth.getInstance().currentUser == null) {
            //TODO: loginActivity
        } else {//TODO: chatActivity}

        }
    }
}