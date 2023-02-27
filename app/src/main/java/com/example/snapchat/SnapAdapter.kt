package com.example.snapchat

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import com.example.snapchat.databinding.ListItemLayoutBinding

class SnapAdapter(val snaps: List<Snap>) : RecyclerView.Adapter<SnapViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SnapViewHolder {
        val binding = ListItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SnapViewHolder(binding)
    }


    override fun onBindViewHolder(currentViewHolder: SnapViewHolder, position: Int) {
        val currentSnap = snaps[position]
        currentViewHolder.bindSnap(currentSnap)
    }


    override fun getItemCount(): Int {
        return snaps.size
    }

}