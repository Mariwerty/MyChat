package com.mariwerty.gigachat.activity


import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.google.firebase.auth.FirebaseAuth
import com.mariwerty.gigachat.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

    }

fun startAuth (){
    val intent = Intent(applicationContext, AuthActivity::class.java)
    val result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        if (it.resultCode== RESULT_OK) {
            //TODO: startChat
        } else {
            //TODO: finish
        }
    }
    result.launch(intent)
}
    override fun onResume() {
        super.onResume()
        FirebaseAuth.getInstance().currentUser
        if (FirebaseAuth.getInstance().currentUser == null) {
            startAuth()
        } else {//TODO: chatActivity

        }
    }
}