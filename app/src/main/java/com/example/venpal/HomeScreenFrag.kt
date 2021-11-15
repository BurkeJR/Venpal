package com.example.venpal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.venpal.databinding.FragmentHomeScreenBinding


class HomeScreenFrag : Fragment() {


    private lateinit var binding: FragmentHomeScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeScreenBinding.inflate(inflater)



        binding.ContactButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeScreenFrag_to_contactFrag)
        }
        binding.StocksButton.setOnClickListener {
                findNavController().navigate(R.id.action_homeScreenFrag_to_stocksFrag)
        }
        binding.CurrencyButton.setOnClickListener {
                findNavController().navigate(R.id.action_homeScreenFrag_to_currencyFrag)
        }

        // Inflate the layout for this fragment
        return binding.root
    }

}