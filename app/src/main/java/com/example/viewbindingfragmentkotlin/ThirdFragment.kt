package com.example.viewbindingfragmentkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewbindingfragmentkotlin.databinding.FragmentFirstBinding
import com.example.viewbindingfragmentkotlin.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {

    private var _binding :  FragmentThirdBinding? = null;

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root

        val thirdText = binding.thirdTextView
        
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

    }
}