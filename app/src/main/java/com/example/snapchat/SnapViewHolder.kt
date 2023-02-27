package com.example.snapchat


import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.snapchat.databinding.ListItemLayoutBinding

class SnapViewHolder(val binding: ListItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {


    private lateinit var currentSnap: Snap

    init {
        binding.root.setOnClickListener {
        currentSnap.opened = true
            binding.root.findNavController()
                .navigate(R.id.action_mainFragment_to_snapPhotoFragment)
        }
    }

    fun bindSnap(snap: Snap) {
        currentSnap = snap
        binding.userName.text = currentSnap.username
        binding.openedTime.text = currentSnap.time
        setSnapStatus(currentSnap.opened)
        binding.imageViewSnapImage.setImageResource(currentSnap.photoResourceId)
    }
    fun setSnapStatus(opened : Boolean) {
        if (opened) {
            binding.snapStatus.text = currentSnap.status
            binding.openedIcon.setImageResource(currentSnap.iconID)
            binding.snapStatus.setTextColor(currentSnap.color)
        }

    }

}