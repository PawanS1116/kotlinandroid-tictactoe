package com.example.tictactoe

import android.graphics.Color
import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.tictactoe.databinding.FragmentGame3x3Binding
import kotlinx.android.synthetic.main.fragment_game3x3.*
import java.util.*
import kotlin.random.Random


class game3x3 : Fragment() {
    var plx:String="X"
    var plo:String="0"
    var pl:String=plx
    var sx:Int=0
    var so:Int=0
    var p=0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding =
            DataBindingUtil.inflate<FragmentGame3x3Binding>(inflater, R.layout.fragment_game3x3, container, false)
val args=game3x3Args.fromBundle(arguments!!)
     binding.textView5.setText("${args.px}")
        binding.textView6.setText("${args.po}")
setTurn(binding)
  binding.b1.setOnClickListener {
            binding.b1.text = pl
            if (pl == plx)
                binding.b1.setTextColor(Color.RED)
            else
                binding.b1.setTextColor(Color.BLACK)
            checkwin(binding)
           pl=func.changepl(pl)
            setTurn(binding)
            binding.b1.setEnabled(false)
p++
            plya(binding,p)
        }
        binding.button2.setOnClickListener {
            binding.button2.text = pl
            if (pl == plx)
                binding.button2.setTextColor(Color.RED)
            else
                binding.button2.setTextColor(Color.BLACK)
            checkwin(binding)
            pl=func.changepl(pl)
            setTurn(binding)
            binding.button2.setEnabled(false)
p++
            plya(binding,p)
        }
        binding.button3.setOnClickListener {
            binding.button3.text = pl
            if (pl == plx)
                binding.button3.setTextColor(Color.RED)
            else
                binding.button3.setTextColor(Color.BLACK)
            checkwin(binding)
            pl=func.changepl(pl)
            setTurn(binding)
            binding.button3.setEnabled(false)
p++
            plya(binding,p)
        }
        binding.button4.setOnClickListener {
            binding.button4.text = pl
            if (pl == plx)
                binding.button4.setTextColor(Color.RED)
            else
                binding.button4.setTextColor(Color.BLACK)
            checkwin(binding)
            pl=func.changepl(pl)
            setTurn(binding)
            binding.button4.setEnabled(false)
p++
            plya(binding,p)
        }
        binding.button5.setOnClickListener {
            binding.button5.text = pl
            if (pl == plx)
                binding.button5.setTextColor(Color.RED)
            else
                binding.button5.setTextColor(Color.BLACK)
            checkwin(binding)
            pl=func.changepl(pl)
            setTurn(binding)
            binding.button5.setEnabled(false)
p++
            plya(binding,p)
        }
        binding.button6.setOnClickListener {
            binding.button6.text = pl
            if (pl == plx)
                binding.button6.setTextColor(Color.RED)
            else
                binding.button6.setTextColor(Color.BLACK)
            checkwin(binding)
            pl=func.changepl(pl)
            setTurn(binding)
            binding.button6.setEnabled(false)
p++
            plya(binding,p)
        }
        binding.button7.setOnClickListener {
            binding.button7.text = pl
            if (pl == plx)
                binding.button7.setTextColor(Color.RED)
            else
                binding.button7.setTextColor(Color.BLACK)
            checkwin(binding)
            pl=func.changepl(pl)
            setTurn(binding)
            binding.button7.setEnabled(false)
p++
            plya(binding,p)
        }
        binding.button8.setOnClickListener {
            binding.button8.text = pl
            if (pl == plx)
                binding.button8.setTextColor(Color.RED)
            else
                binding.button8.setTextColor(Color.BLACK)
            checkwin(binding)
            pl=func.changepl(pl)
            setTurn(binding)
            binding.button8.setEnabled(false)
p++
            plya(binding,p)
        }
        binding.button9.setOnClickListener {
            binding.button9.text = pl
            if (pl == plx)
                binding.button9.setTextColor(Color.RED)
            else
                binding.button9.setTextColor(Color.BLACK)
checkwin(binding)
            pl=func.changepl(pl)
            setTurn(binding)
            binding.button9.setEnabled(false)
p++
            plya(binding,p)
        }
        binding.button11.visibility=GONE

binding.button11.setOnClickListener{
    playagain(binding)
    binding.button11.visibility=GONE
    p=0
    setTurn(binding)
}
        var w:String=""
        binding.button12.setOnClickListener{
            if(sx>so)
              w=args.px
            else if(so>sx)
                w=args.po
            else
                w=""
            findNavController().navigate(game3x3Directions.actionGame3x3ToWin(w))
        }
        return binding.root
    }

private fun checkwin(binding: FragmentGame3x3Binding) {

    val bt1:String = (binding.b1.getText()).toString()
    val bt2:String = (binding.button2.getText()).toString()
    val bt3:String = (binding.button3.getText()).toString()
    val bt4:String = (binding.button4.getText()).toString()
    val bt5:String = (binding.button5.getText()).toString()
    val bt6:String = (binding.button6.getText()).toString()
    val bt7:String = (binding.button7.getText()).toString()
    val bt8:String = (binding.button8.getText()).toString()
    val bt9:String = (binding.button9.getText()).toString()

    if ((bt1 == bt2) && (bt1 == bt3) && (bt1 != "")) {

            binding.b1.setBackgroundColor(Color.CYAN)
            binding.button2.setBackgroundColor(Color.CYAN)
            binding.button3.setBackgroundColor(Color.CYAN)
        if(bt1=="X")
            sx++
        else
            so++
        dis(binding)
        } else if ((bt4 == bt5) && (bt4 == bt6) && (bt4 != "")) {
            binding.button4.setBackgroundColor(Color.CYAN)
            binding.button5.setBackgroundColor(Color.CYAN)
            binding.button6.setBackgroundColor(Color.CYAN)
        if(bt4=="X")
            sx++
        else
            so++
        dis(binding)
        } else if ((bt7 == bt8) && (bt7 == bt9) && (bt7 != "")) {
            binding.button7.setBackgroundColor(Color.CYAN)
            binding.button8.setBackgroundColor(Color.CYAN)
            binding.button9.setBackgroundColor(Color.CYAN)
        if(bt7=="X")
            sx++
        else
            so++
        dis(binding)
        } else if ((bt1 == bt4) && (bt1 == bt7) && (bt1 != "")) {
            binding.b1.setBackgroundColor(Color.CYAN)
            binding.button4.setBackgroundColor(Color.CYAN)
            binding.button7.setBackgroundColor(Color.CYAN)
        if(bt1=="X")
            sx++
        else
            so++
        dis(binding)
        } else if ((bt2 == bt5) && (bt2 == bt8) && (bt2 != "")) {
            binding.button5.setBackgroundColor(Color.CYAN)
            binding.button2.setBackgroundColor(Color.CYAN)
            binding.button8.setBackgroundColor(Color.CYAN)
        if(bt2=="X")
            sx++
        else
            so++
        dis(binding)
        } else if ((bt3 == bt6) && (bt3 == bt9) && (bt3 != "")) {
            binding.button3.setBackgroundColor(Color.CYAN)
            binding.button6.setBackgroundColor(Color.CYAN)
            binding.button9.setBackgroundColor(Color.CYAN)
        if(bt3=="X")
            sx++
        else
            so++
        dis(binding)
        } else if ((bt1 == bt5) && (bt1 == bt9) && (bt1 != "")) {
            binding.b1.setBackgroundColor(Color.CYAN)
            binding.button5.setBackgroundColor(Color.CYAN)
            binding.button9.setBackgroundColor(Color.CYAN)
        if(bt1=="X")
            sx++
        else
            so++
        dis(binding)
        } else if ((bt3 == bt5) && (bt7 == bt3) && (bt3 != "")) {
          binding.button5.setBackgroundColor(Color.CYAN)
            binding.button7.setBackgroundColor(Color.CYAN)
            binding.button3.setBackgroundColor(Color.CYAN)
        if(bt3=="X")
            sx++
        else
            so++
        dis(binding)
        }
    if(sx!=0||so!=0){
       binding.textView9.setText(sx.toString())
        binding.textView10.setText(so.toString())


    }
}
    private fun dis(binding: FragmentGame3x3Binding){
        binding.apply{
            b1.setEnabled(false)
            button2.setEnabled(false)
            button3.setEnabled(false)
            button4.setEnabled(false)
            button5.setEnabled(false)
            button6.setEnabled(false)
            button7.setEnabled(false)
            button8.setEnabled(false)
            button9.setEnabled(false)
            button11.visibility=VISIBLE
        }

    }
    private fun playagain(binding: FragmentGame3x3Binding){

        binding.apply{
            b1.setEnabled(true)
            b1.text=""
            b1.setBackgroundResource(R.drawable.th__3_)
            button2.setEnabled(true)
            button2.text=""
            button2.setBackgroundResource(R.drawable.th__3_)
            button3.setEnabled(true)
            button3.text=""
            button3.setBackgroundResource(R.drawable.th__3_)
            button4.setEnabled(true)
            button4.text=""
            button4.setBackgroundResource(R.drawable.th__3_)
            button5.setEnabled(true)
            button5.text=""
            button5.setBackgroundResource(R.drawable.th__3_)
            button6.setEnabled(true)
            button6.text=""
            button6.setBackgroundResource(R.drawable.th__3_)
            button7.setEnabled(true)
            button7.text=""
            button7.setBackgroundResource(R.drawable.th__3_)
            button8.setEnabled(true)
            button8.text=""
            button8.setBackgroundResource(R.drawable.th__3_)
            button9.setEnabled(true)
            button9.text=""
            button9.setBackgroundResource(R.drawable.th__3_)
        }
    }
    private fun setTurn(binding: FragmentGame3x3Binding) {
        if (pl == plx) {
            binding.textView7.setBackgroundColor(Color.YELLOW)
            binding.textView8.setBackgroundColor(Color.LTGRAY)
        }
        else{
            binding.textView7.setBackgroundColor(Color.LTGRAY)
            binding.textView8.setBackgroundColor(Color.YELLOW)
        }
    }

private fun plya(binding:FragmentGame3x3Binding, p:Int) {
    if (p == 9) {
        binding.button11.visibility = VISIBLE
    }
}
}

