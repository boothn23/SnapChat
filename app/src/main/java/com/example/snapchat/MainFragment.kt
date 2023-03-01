package com.example.snapchat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.snapchat.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    val snaps = listOf(
        com.example.snapchat.Snap("Al Gore", "3m", R.drawable.joe, false),
        Snap("Gary Johnson", "8h", R.drawable.joe, true),
        Snap("Ross Perot", "3d", R.drawable.joe, false),
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val myAdapter = SnapAdapter(snaps)
        binding.recyclerView.adapter = myAdapter


        return rootView
    }
}
