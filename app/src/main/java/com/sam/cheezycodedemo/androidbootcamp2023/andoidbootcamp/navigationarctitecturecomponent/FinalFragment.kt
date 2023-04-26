package com.sam.cheezycodedemo.androidbootcamp2023.andoidbootcamp.navigationarctitecturecomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.sam.cheezycodedemo.R
import com.sam.cheezycodedemo.databinding.FragmentFinalBinding


class FinalFragment : Fragment() {


    private lateinit var binding: FragmentFinalBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_final, container, false)





        return binding.root
    }


}