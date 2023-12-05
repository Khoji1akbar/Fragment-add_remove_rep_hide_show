package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val homeFragment = HomeFragment()
        val loylarFragmenti = LoylarFragmenti()
        val fragmentManager = supportFragmentManager
        val translation = fragmentManager.beginTransaction()


        binding.apply {
            btnAdd.setOnClickListener {
                val translation = fragmentManager.beginTransaction()
                 translation.add(R.id.liner_lott, homeFragment)
                     .commit()
            }
            btnRemove.setOnClickListener {
                val translation = fragmentManager.beginTransaction()
                translation.remove(homeFragment)
                    .commit()
            }

            btnReplace.setOnClickListener {
                val translation = fragmentManager.beginTransaction()
                translation.addToBackStack(loylarFragmenti.toString())
                translation.replace(R.id.liner_lott , loylarFragmenti)
                    .commit()
            }
            binding.btnHide.setOnClickListener {
                val translation = fragmentManager.beginTransaction()
                translation.hide(loylarFragmenti)
                    .commit()
            }
            binding.btnShow.setOnClickListener {
                val translation = fragmentManager.beginTransaction()
                translation.show(loylarFragmenti)
                    .commit()
            }
        }
    }
}