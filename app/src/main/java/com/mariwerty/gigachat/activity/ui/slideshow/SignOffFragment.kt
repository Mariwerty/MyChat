package com.mariwerty.gigachat.activity.ui.slideshow

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.firebase.auth.FirebaseAuth
import com.mariwerty.gigachat.activity.ChatActivity
import com.mariwerty.gigachat.activity.SplashActivity
import com.mariwerty.gigachat.databinding.FragmentSignoffBinding

class SignOffFragment : Fragment() {

    private var _binding: FragmentSignoffBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val signOffViewModel =
            ViewModelProvider(this).get(SignOffViewModel::class.java)

        _binding = FragmentSignoffBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textConfirmation
        signOffViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        val confirmationButton: Button = binding.bntSignoff
        confirmationButton.setOnClickListener{
            FirebaseAuth.getInstance().signOut()
            val login = Intent(activity, SplashActivity::class.java)
            startActivity(login)
            activity?.finish()
        }
        return root
    }
        override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}