package me.cassiano.myapplication

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.support.v4.content.ContextCompat
import android.support.v4.content.res.ResourcesCompat
import android.text.Layout
import android.text.Spanned
import android.text.TextPaint
import android.text.style.LeadingMarginSpan

class CustomQuoteSpan2(context: Context) : LeadingMarginSpan {

    val gap = 200
    val quoteSize = 300
    val leftQuote = "\u201C"
    val paint = TextPaint()

    init {
        paint.textSize = 240f
        paint.color = ContextCompat.getColor(context, R.color.blackish)
        paint.typeface = ResourcesCompat
                .getFont(context, R.font.alegreya_regular)!!
    }


    override fun drawLeadingMargin(canvas: Canvas, paint: Paint, x: Int, dir: Int,
                                   top: Int, baseline: Int, bottom: Int,
                                   text: CharSequence, start: Int, end: Int,
                                   first: Boolean, layout: Layout) {
        if ((text as Spanned).getSpanStart(this) == start) {
            canvas.drawText(leftQuote, x.toFloat(), (top + quoteSize).toFloat(), this.paint)
        }

    }

    override fun getLeadingMargin(p0: Boolean): Int = gap

}