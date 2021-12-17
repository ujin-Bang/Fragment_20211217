package com.neppplus.fragment_20211217.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.neppplus.fragment_20211217.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btnToast2.setOnClickListener {

            Toast.makeText(requireContext(), "두번째 프래그먼트입니다", Toast.LENGTH_SHORT).show()
        }

    }
}