package com.technohem.androidkotlinlearn

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_shared_pref.*

class SharedPrefActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_pref)

        btn_write.setOnClickListener {

            var sp = getSharedPreferences("my_data", Context.MODE_PRIVATE)
            var editor = sp.edit()
            editor.putString("name",et_write.text.toString())
            editor.commit()

            et_write.setText("")
            Toast.makeText(this,"Name Save Successfully",Toast.LENGTH_SHORT).show()
        }

        btn_read.setOnClickListener {

            var sp = getSharedPreferences("my_data", Context.MODE_PRIVATE)
            tv_read.text = sp.getString("name","")

        }
    }
}
