package com.example.sistema_medico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
        val cancelButton : Button = findViewById(R.id.cancel_button)
        val confirmButton : Button = findViewById(R.id.confirm_button)
        val nameEditText : EditText = findViewById(R.id.name_edit_text)
        val emailEditText : EditText = findViewById(R.id.email_edit_text)
        val passwordEditText : EditText = findViewById(R.id.password_edit_text)
        val confirmPasswordEditText : EditText = findViewById(R.id.confirm_password_edit_text)
        cancelButton.setOnClickListener{Toast.makeText(this,"Botão cancelar", Toast.LENGTH_SHORT).show() }
        confirmButton.setOnClickListener{Toast.makeText(this,"Botão confirmar", Toast.LENGTH_SHORT).show() }

    }
}