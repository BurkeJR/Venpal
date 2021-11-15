package com.example.venpal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.venpal.databinding.FragmentStocksBinding


class stocksFragment : Fragment() {

    private lateinit var binding: FragmentStocksBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStocksBinding.inflate(inflater)
        binding.convertButton.setOnClickListener { convert() }

        return binding.root
    }

    private fun convert(){
        val usd = binding.USDnumTV.text.toString()
        try {
            var num = usd.toDouble()
            if(num < 0){
                throw Exception("Negative")
            }
            binding.stocksErrorTV.text = ""
            num *= .88
            binding.foreignMoneyTV.text = String.format("%.2f", num)


        } catch (nfe: Exception) {
            binding.stocksErrorTV.text = "PLEASE ENTER ONLY NUMBER VALUES"
        }

    }
}