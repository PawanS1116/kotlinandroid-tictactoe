package com.example.tictactoe

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.tictactoe.databinding.FragmentFirstBinding


/**
 * A simple [Fragment] subclass.
 */
class first : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding= DataBindingUtil.inflate<FragmentFirstBinding>(inflater,R.layout.fragment_first,container,false)

        val timer=object: CountDownTimer(2000,1000){
            override fun onTick(millisUntilFinished:Long){}
            override fun onFinish(){
                view?.findNavController()?.navigate(R.id.action_first_to_main)
            }}
        timer.start()
        return binding.root
    }

}
