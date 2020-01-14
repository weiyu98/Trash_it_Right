package com.example.menu

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_login.*
import android.content.Context
import android.content.res.Configuration
import java.util.*

class Main2Activity : AppCompatActivity() {

    lateinit var handler: AccDatabase

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadLocale()
        @Suppress("UNUSED_VARIABLE")
        //  val binding = DataBindingUtil.setContentView<ActivityMain2Binding>(this, R.layout.activity_main2)
        handler = AccDatabase(this)
        setContentView(R.layout.fragment_login)

        imageView5.setOnClickListener{
            changeLang()
        }

        loginbtn.setOnClickListener {
            if (login_username.text.toString().isNotEmpty() && login_pass.text.toString().isNotEmpty()) {
                if (handler.userLogin(login_username.text.toString(), login_pass.text.toString())) {
                    Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                    GlobalVariable.userID = login_username.text.toString()
                    GlobalVariable.LoginPassword = login_pass.text.toString()
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                } else {
                    Toast.makeText(this, "Username Or Password Incorrect, Please enter again~", Toast.LENGTH_SHORT).show()
                }
            }else
                Toast.makeText(this, "Username and Password cannot be empty", Toast.LENGTH_SHORT).show()
        }


        txtSignup.setOnClickListener {
            startActivity(Intent(this, Main3Activity::class.java))
            finish()
        }

    }

    private fun changeLang(){
        val listItems = arrayOf("华语","Malay","English")

        val mBuilder = AlertDialog.Builder(this@Main2Activity)
        mBuilder.setTitle("Change Language")
        mBuilder.setSingleChoiceItems(listItems,-1)

        {dialog, i ->
            if(i == 0){
                setLocate("zh")
                Toast.makeText(this, "更换语言- 华语", Toast.LENGTH_SHORT).show()
                recreate()
            }
            else if(i == 1){
                setLocate("ms")
                Toast.makeText(this, "Tukar Bahasa - Melay", Toast.LENGTH_SHORT).show()
                recreate()
            }
            else if(i == 2){
                setLocate("en")
                Toast.makeText(this, "Change Language - English", Toast.LENGTH_SHORT).show()
                recreate()
            }
            dialog.dismiss()
        }
        val mDialog = mBuilder.create()
        mDialog.show()
    }
    private fun setLocate(Lang : String){
        val locale = Locale(Lang)

        Locale.setDefault(locale)

        val config = Configuration()

        config.locale = locale
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)

        val editor = getSharedPreferences("Settings", Context.MODE_PRIVATE).edit()
        editor.putString("My_Lang", Lang)
        editor.apply()
    }

    private fun loadLocale(){
        val prefs = getSharedPreferences("Settings", Context.MODE_PRIVATE)
        val language = prefs.getString("My_Lang","")
        setLocate(language.toString())

    }



}
