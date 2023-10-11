package com.richardson.example.republicapp.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.richardson.example.republicapp.MainActivity
import com.richardson.example.republicapp.R
import com.richardson.example.republicapp.request.items.ResultItem

class HomeFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, null)
    }

    override fun onResume() {
        super.onResume()
        (requireActivity() as MainActivity).
    }

    fun build(resultItem: ResultItem) {

    }
}