package com.mahammadjafarzade.tripwayy.SplashScreen

import android.animation.Animator
import android.animation.Animator.AnimatorListener
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
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
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
        playLattie()
        // Inflate the layout for this fragment
        return binding.root
    }
    private fun playLattie(){
        binding.animationView.repeatCount = 0
        binding.animationView.playAnimation()
        binding.animationView.addAnimatorListener(object : AnimatorListener{
            override fun onAnimationStart(animation: Animator) {
                TODO("Not yet implemented")
            }

            override fun onAnimationEnd(animation: Animator) {
                TODO("Not yet implemented")
            }

            override fun onAnimationCancel(animation: Animator) {
                TODO("Not yet implemented")
            }

            override fun onAnimationRepeat(animation: Animator) {
                TODO("Not yet implemented")
            }
        })
    }
}