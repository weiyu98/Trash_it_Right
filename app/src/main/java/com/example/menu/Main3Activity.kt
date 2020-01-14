package com.example.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_register.*

class Main3Activity : AppCompatActivity() {

    lateinit var handler: AccDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        handler = AccDatabase(this)
        setContentView(R.layout.fragment_register)

        textView5.setOnClickListener{
            startActivity(Intent(this, Main2Activity::class.java))
            finish()
        }

        sign_button.setOnClickListener {
            if(username.text.toString().isNotEmpty()){
                if (handler.verifyUsername(username.text.toString())) {
                    if (pass.text.toString().isNotEmpty()) {
                        if (pass.text.toString() == password.text.toString()) {
                            if (email.text.toString().isNotEmpty()) {
                                handler.insertUserData(username.text.toString(), pass.text.toString(), email.text.toString(), address.text.toString())
                                Toast.makeText(this, "Register Successful", Toast.LENGTH_SHORT).show()
                                startActivity(Intent(this, Main2Activity::class.java))
                                finish()
                            } else {
                                Toast.makeText(this, "Email cannot be empty", Toast.LENGTH_SHORT).show()
                            }
                        } else
                            Toast.makeText(this, "Incorrect Confirm Password", Toast.LENGTH_SHORT).show()
                    } else
                        Toast.makeText(this, "Password cannot be empty", Toast.LENGTH_SHORT).show()
                } else
                    Toast.makeText(this, "Username Been Used", Toast.LENGTH_SHORT).show()
            } else
                Toast.makeText(this, "Username cannot be empty", Toast.LENGTH_SHORT).show()
        }
    }
}

