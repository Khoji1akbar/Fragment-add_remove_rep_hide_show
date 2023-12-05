package com.example.fragment

import android.os.Bundle
import android.service.media.MediaBrowserService.BrowserRoot
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragment.databinding.FragmentLoylarFragmentiBinding

class LoylarFragmenti : Fragment() {

    lateinit var root: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root= inflater.inflate(R.layout.fragment_loylar_fragmenti, container, false)

        root.findViewById<TextView>(R.id.infoo)
            .text = "Loylarning loyi"

        return root
    }

}