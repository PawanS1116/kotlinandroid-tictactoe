package com.example.tictactoe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.INVISIBLE
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.tictactoe.databinding.FragmentWinBinding

/**
 * A simple [Fragment] subclass.
 */
class win : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val binding=DataBindingUtil.inflate<FragmentWinBinding>(inflater,R.layout.fragment_win,container,false)
        val args=winArgs.fromBundle(arguments!!)
        binding.textView12.setText("${args.w}".toUpperCase())
        if(args.w==""){
            binding.textView11.visibility=INVISIBLE
            binding.textView12.visibility=INVISIBLE
            binding.textView13.visibility=INVISIBLE
        }
        else
            binding.textView14.visibility=INVISIBLE
        return binding.root

    }

}
