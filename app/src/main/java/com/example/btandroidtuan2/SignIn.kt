package com.example.btandroidtuan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignIn : AppCompatActivity() {
    private lateinit var btnlogin : Button
    private lateinit var editemail : EditText
    private lateinit var editpass : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        btnlogin = findViewById(R.id.btnlogin)
       editemail = findViewById(R.id.editemail1)
        editpass = findViewById(R.id.editpass1)
        btnlogin.setOnClickListener {
            val email : String = editemail.text.toString()
            val pass : String = editpass.text.toString()
            if(email == "ronaldo@gmail.com" && pass == "123456"){
                var intent = Intent(this,Profile::class.java)
                startActivity(intent)
                finish()
            }else {
                Toast.makeText(this,"Nhập sai email và pass Vui lòng nhập lại",Toast.LENGTH_SHORT).show()
            }
        }
    }
}