package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    
    lateinit var lhs:String
    lateinit var rhs:String
    lateinit var op:String
    lateinit var final:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var expression:TextView = findViewById(R.id.exp)
        var result:TextView = findViewById(R.id.res)
        var ac:Button = findViewById(R.id.ac)
        var div:Button = findViewById(R.id.div)
        var mul:Button = findViewById(R.id.mul)
        var add:Button = findViewById(R.id.add)
        var sub:Button = findViewById(R.id.sub)
        var del:Button = findViewById(R.id.del)
        var one:Button = findViewById(R.id.one)
        var two:Button = findViewById(R.id.two)
        var three:Button = findViewById(R.id.three)
        var four:Button = findViewById(R.id.four)
        var five:Button = findViewById(R.id.five)
        var six:Button = findViewById(R.id.six)
        var seven:Button = findViewById(R.id.seven)
        var eight:Button = findViewById(R.id.eight)
        var nine:Button = findViewById(R.id.nine)
        var equal:Button = findViewById(R.id.equal)
        var zero:Button = findViewById(R.id.zero)
        var dot:Button = findViewById(R.id.dot)
        var mode:Button = findViewById(R.id.mode)
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
            expression.setText(final)
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
            expression.setText(final)
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
            expression.setText(final)
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
            expression.setText(final)
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
            expression.setText(final)
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
            expression.setText(final)
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
            expression.setText(final)
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
            expression.setText(final)
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
            expression.setText(final)
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
            expression.setText(final)
        })
        add.setOnClickListener({
            op = "+"
            final += "+"
            expression.setText(final)
        })
        sub.setOnClickListener({
            op = "-"
            final += "-"
            expression.setText(final)
        })
        mul.setOnClickListener({
            op = "*"
            final += "*"
            expression.setText(final)
        })
        div.setOnClickListener({
            op = "/"
            final += "/"
            expression.setText(final)

        })
        mode.setOnClickListener({
            op = "%"
            final += "%"
            expression.setText(final)
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
            expression.setText(final)
        })
        equal.setOnClickListener({
            if(op === "+")
            {
                var temp1 = lhs.toDouble()
                var temp2 = rhs.toDouble()
                var tempResult = temp1 + temp2
                tempResult = String.format("%.1f", tempResult).toDouble()
                result.setText(tempResult.toString())
            }
            else if(op === "-")
            {
                var temp1 = lhs.toDouble()
                var temp2 = rhs.toDouble()
                var tempResult = temp1 - temp2
                tempResult = String.format("%.1f", tempResult).toDouble()
                result.setText(tempResult.toString())
            }
            else if(op === "*")
            {
                var temp1 = lhs.toDouble()
                var temp2 = rhs.toDouble()
                var tempResult = temp1 * temp2
                tempResult = String.format("%.1f", tempResult).toDouble()
                result.setText(tempResult.toString())
            }
            else if(op === "/")
            {
                var temp1 = lhs.toDouble()
                var temp2 = rhs.toDouble()
                var tempResult = temp1 / temp2
                tempResult = String.format("%.1f", tempResult).toDouble()
                result.setText(tempResult.toString())
            }
            else if(op === "%")
            {
                var temp1 = lhs.toDouble()
                var temp2 = rhs.toDouble()
                var tempResult = temp1 % temp2
                tempResult = String.format("%.1f", tempResult).toDouble()
                result.setText(tempResult.toString())
            }
        })
        del.setOnClickListener({

        })
        ac.setOnClickListener({
            expression.setText("")
            lhs = ""
            rhs = ""
            final = ""
            op = ""
            result.setText("0")
        })

    }
}