package com.sam.cheezycodedemo.androidbootcamp2023.andoidbootcamp.navigationarctitecturecomponent

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.sam.cheezycodedemo.R
import com.sam.cheezycodedemo.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)
        var view : View = binding.root

        binding.button.setOnClickListener(View.OnClickListener {

            if(!TextUtils.isEmpty(binding.editTextTextPersonName.text.toString())){

            // transfer data using bundle
            val bundle : Bundle = bundleOf( "user_input" to binding.editTextTextPersonName.text.toString())
                // view it representing by it
                it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment,bundle)
            }else{
                Toast.makeText(requireContext(),"Please insert your name",Toast.LENGTH_SHORT)
            }

        })



        return view;
    }


}