package com.example.bottomnavigationsheet.navgraph.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationsheet.navgraph.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home,container,false)

        val movTosecondFragment :TextView = view.findViewById(R.id.movetosecond_frag)
        val movtoThirdFragment: TextView = view.findViewById(R.id.movetothird_frag)

        movTosecondFragment.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_personalFragment)
        }

        movtoThirdFragment.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_settingsFragment)
        }

        return view
    }

}