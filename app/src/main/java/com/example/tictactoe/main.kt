package com.example.tictactoe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.*
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.tictactoe.databinding.FragmentMainBinding


/**
 * A simple [Fragment] subclass.
 */
class main : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var ppx: String = ""
        var ppo: String = ""
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(inflater, R.layout.fragment_main, container, false)
        binding.startbtn.setOnClickListener { view: View ->
            var px = ppx
            var po = ppo

            view.findNavController().navigate(mainDirections.actionMainToGame3x3(px, po))
        }
        val dc: Names = Names()
        binding.names = dc

        binding.apply {
            sv.visibility = INVISIBLE
            button.visibility = INVISIBLE
            startbtn.visibility=INVISIBLE
            button10.setOnClickListener { view: View ->
                names?.plyx = editText.text.toString()
                names?.plyo = editText2.text.toString()
                invalidateAll()
                if (names?.plyx == "" || names?.plyo == "") {
                    Toast.makeText(
                        context,
                        "Please Enter Your Names and again Click the DONE Button",
                        Toast.LENGTH_LONG
                    ).show()
                } else {
                    startbtn.visibility = VISIBLE
                    button.visibility = VISIBLE
                    func.hide(getContext(), view)
                    names?.plyx = editText.text.toString()
                    names?.plyo = editText2.text.toString()
                    invalidateAll()
                    ppx = names?.plyx!!
                    ppo = names?.plyo!!
                    editText.setEnabled(false)
                    editText2.setEnabled(false)
                }


            }
            button.setOnClickListener{
                sv.visibility=VISIBLE
            }

        }

        return binding.root
    }
}
