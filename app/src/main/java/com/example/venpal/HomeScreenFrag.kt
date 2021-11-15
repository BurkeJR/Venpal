package com.example.venpal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.venpal.databinding.FragmentHomeScreenBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class HomeScreenFrag : Fragment() {


    private lateinit var binding: FragmentHomeScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeScreenBinding.inflate(inflater)



        binding.ContactButton.setOnClickListener {
            val action =
            findNavController().navigate(action)
        }
        binding.StocksButton.setOnClickListener {
            val action =
                findNavController().navigate(action)
        }
        binding.CurrencyButton.setOnClickListener {
            val action =
                findNavController().navigate(action)
        }

        // Inflate the layout for this fragment
        return binding.root
    }

}