package com.ksharshembie.warehouseinventor.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ksharshembie.warehouseinventor.databinding.FragmentStockInBinding

class StockInFragment : Fragment() {

    private lateinit var binding: FragmentStockInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStockInBinding.inflate(LayoutInflater.from(context), container, false)
        return binding.root
    }

}