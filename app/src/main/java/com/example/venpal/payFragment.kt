package com.example.venpal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.example.venpal.databinding.FragmentPayBinding


class payFragment : Fragment() {

    private lateinit var binding: FragmentPayBinding

//    val args: PayFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPayBinding.inflate(inflater)

//        binding.payText.text = args.contact

        binding.acceptButton.setOnClickListener {
            val payment = binding.enterPay.text
            Toast.makeText(activity, "Payment Made", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }


}