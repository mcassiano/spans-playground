package me.cassiano.myapplication

import android.os.Build
import android.text.TextPaint
import android.text.style.CharacterStyle

class LetterSpacingSpan(val spacing: Float) : CharacterStyle() {
    override fun updateDrawState(paint: TextPaint) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            paint.letterSpacing = spacing
    }
}