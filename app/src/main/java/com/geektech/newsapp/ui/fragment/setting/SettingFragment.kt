package com.geektech.newsapp.ui.fragment.setting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import com.geektech.newsapp.R
import com.geektech.newsapp.databinding.FragmentSettingBinding

class SettingFragment : Fragment() {

    lateinit var binding: FragmentSettingBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSettingBinding.inflate(LayoutInflater.from(context))
        return binding.root
        setupNight()
    }

    private fun setupNight() = with(binding){
        DarkModeScSetting.setOnClickListener{
            if (DarkModeScSetting.isChecked){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }
    }
}