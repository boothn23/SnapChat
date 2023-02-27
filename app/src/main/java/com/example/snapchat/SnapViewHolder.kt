package com.example.snapchat


import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.snapchat.databinding.FragmentMainBinding
import com.example.snapchat.databinding.ListItemLayoutBinding

class SnapViewHolder(val binding: ListItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {


    private lateinit var currentSnap: Snap

    init {
        binding.root.setOnClickListener {
            if (!currentSnap.opened) {
                binding.root.findNavController()
                    .navigate(R.id.action_mainFragment_to_snapPhotoFragment)
            }
            currentSnap.opened = true
            setSnapStatus()

        }
    }

    fun bindSnap(snap: Snap) {
        currentSnap = snap
        binding.userName.text = currentSnap.username
        binding.openedTime.text = currentSnap.time
        setSnapStatus()
        binding.imageViewSnapImage.setImageResource(currentSnap.photoResourceId)
    }

    fun setSnapStatus() {
        binding.snapStatus.text = currentSnap.status
        binding.openedIcon.setImageResource(currentSnap.iconID)
        binding.snapStatus.setTextColor(currentSnap.color)
    }

}
