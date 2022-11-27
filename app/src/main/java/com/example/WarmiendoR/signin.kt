package com.example.WarmiendoR

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class signin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val btn_login: Button = findViewById(R.id.btn_login)
        val username: EditText = findViewById(R.id.etUsername)
        val password: EditText = findViewById(R.id.etPassword)
        val btn_signup: Button = findViewById(R.id.btn_signup)

        btn_login.setOnClickListener{
            if (username.text.isBlank() == true && password.text.isBlank() == true)
                Toast.makeText(this, "Masukkan Username dan Password!", Toast.LENGTH_SHORT).show()
            else if (username.text.isBlank() == true)
                Toast.makeText(this, "Masukkan Username!", Toast.LENGTH_SHORT).show()
            else if (password.text.isBlank() == true)
                Toast.makeText(this, "Masukkan Password!", Toast.LENGTH_SHORT).show()
            else if (username.text.toString() == "rangga" && password.text.toString() == "123"){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)}
            else {
                Toast.makeText(this, "Username dan Password Salah!", Toast.LENGTH_SHORT).show()
            }
        }

        btn_signup.setOnClickListener{
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }
    }
}