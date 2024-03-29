package com.sam.cheezycodedemo.androidbootcamp2023.andoidbootcamp.navigationarctitecturecomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.sam.cheezycodedemo.R
import com.sam.cheezycodedemo.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_second, container, false)

        val input : String? = requireArguments().getString("user_input")
        binding.textView.text = input.toString()


        binding.button2.setOnClickListener(View.OnClickListener {
            it.findNavController().navigate(R.id.action_secondFragment_to_finalFragment)

        })


        return binding.root;
    }


}