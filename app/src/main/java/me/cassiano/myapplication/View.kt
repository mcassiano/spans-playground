package me.cassiano.myapplication

import android.view.View
import android.widget.Toast

fun View.showToast(message: String, duration: Int) {
    Toast.makeText(context, message, duration).show()
}