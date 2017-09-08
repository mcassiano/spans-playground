package me.cassiano.myapplication

import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.style.QuoteSpan

fun Spannable.replaceQuoteSpansWithCustomSpan(): Spannable {

    val quoteSpans = this.getSpans(0, this.length, QuoteSpan::class.java)
    quoteSpans.forEach {
        val start = this.getSpanStart(it)
        val end = this.getSpanEnd(it)
        this.removeSpan(it)
        val newQuoteSpan = CustomQuoteSpan()
        this.setSpan(newQuoteSpan, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
    }

    return this
}

fun Spanned.replaceQuoteSpansWithCustomSpan(): Spanned {
    return SpannableString(this).replaceQuoteSpansWithCustomSpan()
}