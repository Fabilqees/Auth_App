package com.example.auth_app.viewmodels

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.google.firebase.Firebase
import com.google.firebase.auth.auth

class AuthViewModel: ViewModel() {
    var isUserAuthenticated = mutableStateOf(false)
    var errorMessage = mutableStateOf("")

    fun loginUser(email: String, password: String) {
        Firebase.auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener {task ->
                if (task.isSuccessful) {
                    isUserAuthenticated.value = true

                } else {
                    errorMessage.value = task.exception?.message.toString()

                    Log.e("SIGN In Not Successful", task.exception.toString())
                }
            }
    }


    fun signInUserWithGoogle() {


    }

    fun signout() {
        Firebase.auth.signOut()
        isUserAuthenticated.value = false
    }

    fun registerUser(fullName: String, password: String, email: String) {
        Firebase.auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener {task ->
                if (task.isSuccessful) {
                    isUserAuthenticated
                } else {
                    errorMessage.value = task.exception?.message.toString()
                    Log.e("SIGN In Not Successful", task.exception.toString())
                }
            }
    }

    fun clearErrorMessage(){
        errorMessage.value = ""
    }
}