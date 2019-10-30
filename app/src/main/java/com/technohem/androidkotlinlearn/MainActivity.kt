package com.technohem.androidkotlinlearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if (num1.text.toString().isEmpty() || num2.text.toString().isEmpty())
            {
                Toast.makeText(this,"First Enter Number",Toast.LENGTH_SHORT).show()
            }
            else {

                var x: Int = num1.text.toString().toInt()
                var y: Int = num2.text.toString().toInt()
                var z: Int = x + y

                txtView_Result.setText("$x + $y = $z")
                Toast.makeText(this, "This is result: " + z, Toast.LENGTH_SHORT).show()

                //to clear edit text field after addition
                num1.setText("")
                num2.setText("")
            }
        }

        btn_nextActicty.setOnClickListener {
            var name:String = edtText_name.text.toString()
            if (name.isEmpty())
            {
                Toast.makeText(this,"Please enter your name first",Toast.LENGTH_SHORT).show()
            }
            else
            {
                // take text to next Activity
                var i = Intent(this,RadioButtonActivity::class.java)
                i.putExtra("name",name)
                startActivity(i)
                finish()

                // to go on next activity
                /*var i = Intent(this,RadioButtonActivity::class.java)
                startActivity(i)*/
            }
        }
    }
}
