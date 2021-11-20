package com.vidya.viewpager2vidya


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val menuTeks = arrayOf("Teman", "Github", "Profile")
    val menuIcon = arrayOf(R.drawable.ic_icons8_home, R.drawable.ic_add_svgrepo_com, R.drawable.ic_profile_user_svgrepo_com)
//    ini

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter (this)
        view_pager.setAdapter(adapter)
        TabLayoutMediator (tab_layout, view_pager,
            TabLayoutMediator.TabConfigurationStrategy{tab, position ->
            tab.text = menuTeks [position]
            tab.icon= ResourcesCompat.getDrawable(resources, menuIcon[position], null)
        }).attach()
    }
}
