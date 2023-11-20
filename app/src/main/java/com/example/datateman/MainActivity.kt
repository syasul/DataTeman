package com.example.datateman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.example.datateman.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val menuTeks = arrayOf("Teman", "Github", "Profile")
    val menuIcon = arrayOf(R.drawable.icons8_home, R.drawable.icons8_add_48, R.drawable.icons8_male_user_50)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val adapter = ViewPagerAdapter(this)
        binding.viewPager.setAdapter(adapter);
        TabLayoutMediator(binding.tabLayout, binding.viewPager,{ tab, position ->
            tab.text=menuTeks[position]
            tab.icon=ResourcesCompat.getDrawable(resources, menuIcon[position], null)
        }).attach()
    }

}