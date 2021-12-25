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
            if(op === "")
            {
                lhs += "1"
            }
            else
            {
                rhs += "1"
            }
            final += "1"
            exp.setText(final)
        })
        two.setOnClickListener({
            if(op === "")
            {
                lhs += "2"
            }
            else
            {
                rhs += "2"
            }
            final += "2"
            exp.setText(final)
        })
        three.setOnClickListener({
            if(op === "")
            {
                lhs += "3"
            }
            else
            {
                rhs += "3"
            }
            final += "3"
            exp.setText(final)
        })
        four.setOnClickListener({
            if(op === "")
            {
                lhs += "4"
            }
            else
            {
                rhs += "4"
            }
            final += "4"
            exp.setText(final)
        })
        five.setOnClickListener({
            if(op === "")
            {
                lhs += "5"
            }
            else
            {
                rhs += "5"
            }
            final += "5"
            exp.setText(final)
        })
        six.setOnClickListener({
            if(op === "")
            {
                lhs += "6"
            }
            else
            {
                rhs += "6"
            }
            final += "6"
            exp.setText(final)
        })
        seven.setOnClickListener({
            if(op === "")
            {
                lhs += "7"
            }
            else
            {
                rhs += "7"
            }
            final += "7"
            exp.setText(final)
        })
        eight.setOnClickListener({
            if(op === "")
            {
                lhs += "8"
            }
            else
            {
                rhs += "8"
            }
            final += "8"
            exp.setText(final)
        })
        nine.setOnClickListener({
            if(op === "")
            {
                lhs += "9"
            }
            else
            {
                rhs += "9"
            }
            final += "9"
            exp.setText(final)
        })
        zero.setOnClickListener({
            if(op === "")
            {
                lhs += "0"
            }
            else
            {
                rhs += "0"
            }
            final += "0"
            exp.setText(final)
        })
        add.setOnClickListener({
            op = "+"
            final += "+"
            exp.setText(final)
        })
        sub.setOnClickListener({
            op = "-"
            final += "-"
            exp.setText(final)
        })
        mul.setOnClickListener({
            op = "*"
            final += "*"
            exp.setText(final)
        })
        div.setOnClickListener({
            op = "/"
            final += "/"
            exp.setText(final)

        })
        mode.setOnClickListener({
            op = "%"
            final += "%"
            exp.setText(final)
        })
        dot.setOnClickListener({
            if(op === "")
            {
                lhs += "."
            }
            else
            {
                rhs += "."
            }
            final += "."
            exp.setText(final)
        })
        equal.setOnClickListener({
            if(op === "+")
            {
                var temp1 = lhs.toDouble()
                var temp2 = rhs.toDouble()
                var tempResult = temp1 + temp2
                tempResult = String.format("%.1f", tempResult).toDouble()
                res.setText(tempResult.toString())
            }
            else if(op === "-")
            {
                var temp1 = lhs.toDouble()
                var temp2 = rhs.toDouble()
                var tempResult = temp1 - temp2
                tempResult = String.format("%.1f", tempResult).toDouble()
                res.setText(tempResult.toString())
            }
            else if(op === "*")
            {
                var temp1 = lhs.toDouble()
                var temp2 = rhs.toDouble()
                var tempResult = temp1 * temp2
                tempResult = String.format("%.1f", tempResult).toDouble()
                res.setText(tempResult.toString())
            }
            else if(op === "/")
            {
                var temp1 = lhs.toDouble()
                var temp2 = rhs.toDouble()
                var tempResult = temp1 / temp2
                tempResult = String.format("%.1f", tempResult).toDouble()
                res.setText(tempResult.toString())
            }
            else if(op === "%")
            {
                var temp1 = lhs.toDouble()
                var temp2 = rhs.toDouble()
                var tempResult = temp1 % temp2
                tempResult = String.format("%.1f", tempResult).toDouble()
                res.setText(tempResult.toString())
            }
        })
        del.setOnClickListener({

        })
        ac.setOnClickListener({
            exp.setText("")
            lhs = ""
            rhs = ""
            final = ""
            op = ""
            res.setText("0")
        })

    }
}