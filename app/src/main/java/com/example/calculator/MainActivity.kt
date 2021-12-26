package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    
    lateinit var lhs:String
    lateinit var rhs:String
    lateinit var op:String
    lateinit var final:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lhs = ""
        rhs = ""
        op = ""
        final = ""

        one.setOnClickListener({
            setNumber("1")
        })
        two.setOnClickListener({
            setNumber("2")
        })
        three.setOnClickListener({
            setNumber("3")
        })
        four.setOnClickListener({
            setNumber("4")
        })
        five.setOnClickListener({
           setNumber("5")
        })
        six.setOnClickListener({
            setNumber("6")
        })
        seven.setOnClickListener({
            setNumber("7")
        })
        eight.setOnClickListener({
            setNumber("8")
        })
        nine.setOnClickListener({
            setNumber("9")
        })
        zero.setOnClickListener({
            setNumber("0")
        })
        dot.setOnClickListener({
            setNumber(".")
        })
        add.setOnClickListener({
            setOperator("+")
        })
        sub.setOnClickListener({
            setOperator("-")
        })
        mul.setOnClickListener({
            setOperator("*")
        })
        div.setOnClickListener({
            setOperator("/")

        })
        mode.setOnClickListener({
            setOperator("%")
        })
        equal.setOnClickListener({
            calculateResult()
        })
        del.setOnClickListener({
            removeLast()
        })
        ac.setOnClickListener({
            clearAll()
        })

    }
    private fun setNumber(num:String)
    {
        if(op == "")
        {
            lhs += num
        }
        else
        {
            rhs += num
        }
        final += num
        exp.text = final
    }
    private fun setOperator(operator:String)
    {
        op = operator
        final += operator
        exp.text = final
    }
    private fun calculateResult()
    {
        when(op)
        {
            "+" -> {
                var temp1 = lhs.toDouble()
                var temp2 = rhs.toDouble()
                var tempResult = temp1 + temp2
                tempResult = String.format("%.1f", tempResult).toDouble()
                res.text = tempResult.toString()
            }
            "-" -> {
                var temp1 = lhs.toDouble()
                var temp2 = rhs.toDouble()
                var tempResult = temp1 - temp2
                tempResult = String.format("%.1f", tempResult).toDouble()
                res.text = tempResult.toString()
            }
            "*" -> {
                var temp1 = lhs.toDouble()
                var temp2 = rhs.toDouble()
                var tempResult = temp1 * temp2
                tempResult = String.format("%.1f", tempResult).toDouble()
                res.text = tempResult.toString()
            }
            "/" -> {
                var temp1 = lhs.toDouble()
                var temp2 = rhs.toDouble()
                var tempResult = temp1 / temp2
                tempResult = String.format("%.1f", tempResult).toDouble()
                res.text = tempResult.toString()
            }
            "%" -> {
                var temp1 = lhs.toDouble()
                var temp2 = rhs.toDouble()
                var tempResult = temp1 % temp2
                tempResult = String.format("%.1f", tempResult).toDouble()
                res.text = tempResult.toString()
            }
        }
    }
    private fun removeLast()
    {
        val size = exp.length()
        if(size > 0)
        {
            exp.text = exp.text.subSequence(0,size-1)
        }
        if(final != "")
        {
            final = final.dropLast(1)
        }
        if(rhs == "" && op == "")
        {
            lhs = lhs.dropLast(1)
        }
        else if(rhs != "")
        {
            rhs = rhs.dropLast(1)
        }
        else
        {
            op = op.dropLast(1)
        }
    }
    private fun clearAll()
    {
        exp.text = ""
        lhs = ""
        rhs = ""
        final = ""
        op = ""
        res.text = "0"
    }
}