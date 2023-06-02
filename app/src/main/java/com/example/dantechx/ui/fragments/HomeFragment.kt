package com.example.dantechx.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.dantechx.R
import com.example.dantechx.ui.activities.EcommerceActivity
import com.example.dantechx.ui.activities.Login

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        val xx = root.findViewById<TextView>(R.id.tv_ecommerce)
        xx.setOnClickListener {
            val intent = Intent(activity, EcommerceActivity::class.java)
            startActivity(intent)
        }

        return root
    }



}