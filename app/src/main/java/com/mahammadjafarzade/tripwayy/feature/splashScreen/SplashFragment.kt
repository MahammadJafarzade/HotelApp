package com.mahammadjafarzade.tripwayy.SplashScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.mahammadjafarzade.tripwayy.R
import com.mahammadjafarzade.tripwayy.databinding.FragmentSplashBinding
import com.mahammadjafarzade.tripwayy.feature.splashScreen.SplashViewModel
import com.mahammadjafarzade.tripwayy.util.MySharedPreferences
import javax.inject.Inject


class SplashFragment : Fragment() {

    val viewModel : SplashViewModel by viewModels()
     lateinit var binding: FragmentSplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }
    private fun playLattie(){
        
    }
}