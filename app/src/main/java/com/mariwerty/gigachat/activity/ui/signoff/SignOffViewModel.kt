package com.mariwerty.gigachat.activity.ui.signoff

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignOffViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Are you sure you want to log out?"
    }
    val text: LiveData<String> = _text
}