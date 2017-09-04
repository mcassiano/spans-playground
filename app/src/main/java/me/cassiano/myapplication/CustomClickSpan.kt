package me.cassiano.myapplication

import android.text.TextPaint
import android.text.style.ClickableSpan
import android.view.View
import android.widget.Toast.LENGTH_SHORT

class CustomClickSpan : ClickableSpan() {

    override fun onClick(view: View) {
        view.showToast("Clicked!", LENGTH_SHORT)
    }

    override fun updateDrawState(textPaint: TextPaint) {
        textPaint.isUnderlineText = true
    }
}