package com.example.bottomnavigationsheet.navgraph.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationsheet.navgraph.R

class PersonalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_personal,container,false)

        val movtoThirdFragment: TextView = view.findViewById(R.id.movetothird_frag)

        movtoThirdFragment.setOnClickListener {
            findNavController().navigate(R.id.action_personalFragment_to_settingsFragment)
        }

        return view
    }


}