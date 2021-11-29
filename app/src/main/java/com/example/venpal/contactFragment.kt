package com.example.venpal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.NavHostFragment
import com.example.venpal.databinding.FragmentContactBinding
import com.example.venpal.databinding.FragmentPayBinding

private lateinit var binding : FragmentContactBinding

class contactFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContactBinding.inflate(inflater)

        binding.payBtn.setOnClickListener {
            val contact = binding.contactName.text
            NavHostFragment.findNavController(this).navigate(R.id.action_contactFragment_to_payFragment)
        }

        return binding.root
    }
}