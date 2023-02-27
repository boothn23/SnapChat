package com.example.snapchat

import android.graphics.Color

data class Snap(
        val username: String,
        val time: String,
        var photoResourceId: Int,
        var opened: Boolean) {

        val status: String
            get() =
                if (opened)
                    "Received"
                else
                    "New Snap"

        val iconID: Int
        get() =
            if(opened)
                R.drawable.opened
                else
                    R.drawable.unopened

        val color: Int
        get() =
            if(opened)
                Color.parseColor("#F60047")
            else
                Color.GRAY
    }