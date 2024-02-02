package com.bootan.welcomeapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


@Suppress("UNREACHABLE_CODE")
class StartFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_start, container, false)

        val welcomeText = view.findViewById<TextView>(R.id.welcomeTV)
        val changeBTN = view.findViewById<Button>(R.id.changeBTN)

        changeBTN.setOnClickListener {
            welcomeText.text = "Goodbye!"
        }
        return view
    }
}