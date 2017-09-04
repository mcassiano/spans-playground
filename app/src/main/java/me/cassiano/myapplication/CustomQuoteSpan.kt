package me.cassiano.myapplication

import android.graphics.Canvas
import android.graphics.Paint
import android.text.Layout
import android.text.Spanned
import android.text.TextPaint
import android.text.style.LeadingMarginSpan

class CustomQuoteSpan : LeadingMarginSpan {

    val gap = 200
    val quoteSize = 300
    val leftQuote = "\u201C"
    val paint = TextPaint()

    init {
        paint.textSize = 240f
    }



    override fun drawLeadingMargin(canvas: Canvas, paint: Paint, x: Int, dir: Int,
                                   top: Int, baseline: Int, bottom: Int,
                                   text: CharSequence, start: Int, end: Int,
                                   first: Boolean, layout: Layout) {
        if ((text as Spanned).getSpanStart(this) == start) {
            canvas.drawText(leftQuote, x.toFloat(), (top + quoteSize).toFloat(), this.paint)
        }

    }

    override fun getLeadingMargin(p0: Boolean): Int  = gap

}