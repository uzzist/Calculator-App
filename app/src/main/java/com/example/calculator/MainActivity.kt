package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    
    private var operation = false
    private var decimal = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        one.setOnClickListener({
            myEvaluater("1",true)
        })
        two.setOnClickListener({
            myEvaluater("2",true)
        })
        three.setOnClickListener({
            myEvaluater("3",true)
        })
        four.setOnClickListener({
            myEvaluater("4",true)
        })
        five.setOnClickListener({
            myEvaluater("5",true)
        })
        six.setOnClickListener({
            myEvaluater("6",true)
        })
        seven.setOnClickListener({
            myEvaluater("7",true)
        })
        eight.setOnClickListener({
            myEvaluater("8",true)
        })
        nine.setOnClickListener({
            myEvaluater("9",true)
        })
        zero.setOnClickListener({
            myEvaluater("0",true)
        })
        dot.setOnClickListener({
            myEvaluater(".",true)
        })
        add.setOnClickListener({
            myEvaluater("+",true)
        })
        sub.setOnClickListener({
            myEvaluater("-",true)
        })
        mul.setOnClickListener({
            myEvaluater("*",true)
        })
        div.setOnClickListener({
            myEvaluater("/",true)
        })
        mode.setOnClickListener({
            myEvaluater("%",true)
        })
        equal.setOnClickListener({
            val text = exp.text.toString()
            val expression = ExpressionBuilder(text).build()
            val result = expression.evaluate().toDouble()
            val longResult = result.toLong()
            if(result == longResult.toDouble())
            {
                res.text = longResult.toString()
            }
            else
            {
                res.text = result.toString()
            }

        })
        del.setOnClickListener({
            val text = exp.text.toString()
            if(text.isNotEmpty())
            {
                exp.text = text.dropLast(1)
            }
            res.text = ""
        })
        ac.setOnClickListener({
            exp.text = ""
            res.text = "0"
        })

    }

    fun myEvaluater(string:String, clear:Boolean)
    {
        if(clear)
        {
            res.text = ""
            exp.append(string)
        }
        else
        {
            exp.append(res.text)
            exp.append(string)
            res.text = ""
        }
    }

}