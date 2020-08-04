package com.example.splash

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login.*

class Login:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        btnSignIn.setOnClickListener {
            if (validateUserInputs()) {
                preferences()


            }

        }

    }

    private fun validateUserInputs(): Boolean {

        val Email = etEmail.text
        val password = etPassword.text

        when {

            Email.isEmpty() -> {
                showToast("Email should not be empty")
            }
            !(android.util.Patterns.EMAIL_ADDRESS.matcher(Email.toString()).matches()) -> {
                showToast("Please enter a valid email address")
            }
            password.isEmpty()->{
                showToast("Password should not be empty")
            }

            else -> return false
        }
        return true
    }

        private fun showToast(message: String) {
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    private fun preferences() {
        val sharedPreferences = getSharedPreferences("Harika", Context.MODE_PRIVATE)

        val editor = sharedPreferences.edit()
        editor.putString("Email","harika.sarikonda@gmail.com")
        editor.putString("PASSWORD","equate123")
        editor.apply()
    }
    private fun navigateToDashBoard(){
        val intent = Intent(this,DashBoard::class.java)
        startActivity(intent)
        finish()
    }


    }