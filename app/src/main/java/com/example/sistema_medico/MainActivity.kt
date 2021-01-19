package com.example.sistema_medico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val createAccountButton : Button = findViewById(R.id.create_account_button)
        val loginButton : Button = findViewById(R.id.login_button)
        createAccountButton.setOnClickListener{
            val intent = Intent(this, CreateAccount::class.java)
            startActivity(intent)
        }

        loginButton.setOnClickListener{
          Toast.makeText(this, "Ação de acessar", Toast.LENGTH_LONG).show()
        }
    }

}


