package com.technohem.androidkotlinlearn

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_radio_button.*

class RadioButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)

        rdo_red.setOnClickListener {
            screen.setBackgroundColor(Color.parseColor("#ff0000"))
        }

        rdo_green.setOnClickListener {
            screen.setBackgroundColor(Color.parseColor("#00ff00"))
        }

        rdo_blue.setOnClickListener {
            screen.setBackgroundColor(Color.parseColor("#0000ff"))
        }

        // get your name on next activity
        textView_name.text = "Welcome " + intent.getStringExtra("name")

        btn_NxtActivity.setOnClickListener {
            var i = Intent(this,SharedPrefActivity::class.java)
            startActivity(i)
            finish()
        }
    }

}
