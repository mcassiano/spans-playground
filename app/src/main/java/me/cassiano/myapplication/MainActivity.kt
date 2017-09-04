package me.cassiano.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.text.Layout
import android.text.SpannableString
import android.widget.TextView
import android.text.SpannableStringBuilder
import android.text.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
import android.text.style.*
import android.support.v4.content.res.ResourcesCompat


class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.text)
        letterSpacingSpan()
    }

//    private fun bulletSpan() {
//        val bulletSpacing = 20 // px!
//        val items = arrayOf("Item 1", "Item 2", "Item 3")
//        val ssb = SpannableStringBuilder()
//
//        items.forEach {
//            val ss = SpannableString(it)
//            ss.setSpan(BulletSpan(bulletSpacing), 0, it.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//            ssb.appendln(ss)
//        }
//
//        textView.text = ssb
//    }
//
//    private fun quoteSpan() {
//        val quote = "I'm selfish, impatient and a little insecure." +
//                "I make mistakes, I am out of control and at times hard to handle." +
//                "But if you can't handle me at my worst," +
//                "then you sure as hell don't deserve me at my best."
//
//        val author = "Marilyn Monroe"
//
//        val quoteSpan = SpannableString(quote)
//        quoteSpan.setSpan(QuoteSpan(), 0,
//                quote.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        val authorSpan = SpannableString(author)
////        authorSpan.setSpan(AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE),
////                0, author.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//
//
//        val finalText = SpannableStringBuilder()
//        finalText.appendln(quoteSpan)
//        finalText.append(authorSpan)
//
//        textView.text = finalText
//
//
//    }
//
//    private fun customQuoteSpan() {
//        val quote = "I'm selfish, impatient and a little insecure." +
//                "I make mistakes, I am out of control and at times hard to handle." +
//                "But if you can't handle me at my worst," +
//                "then you sure as hell don't deserve me at my best."
//
//        val author = "Marilyn Monroe"
//
//        val quoteSpan = SpannableString(quote)
//        quoteSpan.setSpan(CustomQuoteSpan(), 0,
//                quote.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        val authorSpan = SpannableString(author)
//        authorSpan.setSpan(AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE),
//                0, author.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//
//
//        val finalText = SpannableStringBuilder()
//        finalText
//                .appendln(quoteSpan)
//                .appendln()
//                .append(authorSpan)
//
//        textView.text = finalText
//    }
//
//    private fun styleSpan() {
//        val quote = "I'm selfish, impatient and a little insecure." +
//                "I make mistakes, I am out of control and at times hard to handle." +
//                "But if you can't handle me at my worst," +
//                "then you sure as hell don't deserve me at my best."
//
//        val author = "Marilyn Monroe"
//
//        val quoteSpan = SpannableString(quote)
//        quoteSpan.setSpan(CustomQuoteSpan(), 0,
//                quote.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//        quoteSpan.setSpan(StyleSpan(Typeface.ITALIC), 0,
//                quote.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        val authorSpan = SpannableString(author)
//        authorSpan.setSpan(AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE),
//                0, author.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//        authorSpan.setSpan(StyleSpan(Typeface.BOLD), 0,
//                author.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//
//
//        val finalText = SpannableStringBuilder()
//        finalText
//                .appendln(quoteSpan)
//                .appendln()
//                .append(authorSpan)
//
//        textView.text = finalText
//
//    }
//
//    @TargetApi(Build.VERSION_CODES.M)
//    private fun foregroundColor() {
//        val quote = "I'm selfish, impatient and a little insecure." +
//                "I make mistakes, I am out of control and at times hard to handle." +
//                "But if you can't handle me at my worst," +
//                "then you sure as hell don't deserve me at my best."
//
//        val selfish = "selfish"
//        val impatient = "impatient"
//        val insecure = "insecure"
//
//        val author = "Marilyn Monroe"
//
//        val quoteSpan = SpannableString(quote)
//        quoteSpan.setSpan(CustomQuoteSpan(), 0,
//                quote.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//        quoteSpan.setSpan(StyleSpan(Typeface.ITALIC), 0,
//                quote.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        val color = ForegroundColorSpan(getColor(R.color.colorAccent))
//        quoteSpan.setSpan(color,
//                quote.indexOf(selfish),
//                quote.indexOf(selfish) + selfish.length,
//                SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        // do the same for the other words
//
//        quoteSpan.setSpan(ForegroundColorSpan(getColor(R.color.colorAccent)),
//                quote.indexOf(impatient),
//                quote.indexOf(impatient) + impatient.length,
//                SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        quoteSpan.setSpan(ForegroundColorSpan(getColor(R.color.colorAccent)),
//                quote.indexOf(insecure),
//                quote.indexOf(insecure) + insecure.length,
//                SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        val authorSpan = SpannableString(author)
//        authorSpan.setSpan(AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE),
//                0, author.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//        authorSpan.setSpan(StyleSpan(Typeface.BOLD), 0,
//                author.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//
//
//        val finalText = SpannableStringBuilder()
//        finalText
//                .appendln(quoteSpan)
//                .appendln()
//                .append(authorSpan)
//
//        textView.text = finalText
//    }
//
//    @TargetApi(Build.VERSION_CODES.M)
//    private fun relativeSizeSpan() {
//
//        val quote = "I'm selfish, impatient and a little insecure." +
//                "I make mistakes, I am out of control and at times hard to handle." +
//                "But if you can't handle me at my worst," +
//                "then you sure as hell don't deserve me at my best."
//
//        val selfish = "selfish"
//        val impatient = "impatient"
//        val insecure = "insecure"
//        val sureAsHell = "sure as hell"
//
//        val author = "Marilyn Monroe"
//
//        val quoteSpan = SpannableString(quote)
//        quoteSpan.setSpan(CustomQuoteSpan(), 0,
//                quote.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//        quoteSpan.setSpan(StyleSpan(Typeface.ITALIC), 0,
//                quote.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        val color = ForegroundColorSpan(getColor(R.color.colorAccent))
//        quoteSpan.setSpan(color,
//                quote.indexOf(selfish),
//                quote.indexOf(selfish) + selfish.length,
//                SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        // do the same for the other words
//
//        quoteSpan.setSpan(ForegroundColorSpan(getColor(R.color.colorAccent)),
//                quote.indexOf(impatient),
//                quote.indexOf(impatient) + impatient.length,
//                SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        quoteSpan.setSpan(ForegroundColorSpan(getColor(R.color.colorAccent)),
//                quote.indexOf(insecure),
//                quote.indexOf(insecure) + insecure.length,
//                SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        quoteSpan.setSpan(RelativeSizeSpan(1.5f),
//                quote.indexOf(sureAsHell),
//                quote.indexOf(sureAsHell) + sureAsHell.length,
//                SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        quoteSpan.setSpan(BackgroundColorSpan(getColor(R.color.colorAccent)),
//                quote.indexOf(sureAsHell),
//                quote.indexOf(sureAsHell) + sureAsHell.length,
//                SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        quoteSpan.setSpan(ForegroundColorSpan(getColor(R.color.white)),
//                quote.indexOf(sureAsHell),
//                quote.indexOf(sureAsHell) + sureAsHell.length,
//                SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        val authorSpan = SpannableString(author)
//        authorSpan.setSpan(AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE),
//                0, author.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//        authorSpan.setSpan(StyleSpan(Typeface.BOLD), 0,
//                author.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//
//
//        val finalText = SpannableStringBuilder()
//        finalText
//                .appendln(quoteSpan)
//                .appendln()
//                .append(authorSpan)
//
//        textView.text = finalText
//
//    }
//
//    @TargetApi(Build.VERSION_CODES.M)
//    private fun typefaceSpan() {
//
//        val italicTypeface = ResourcesCompat
//                .getFont(this, R.font.alegreya_italic)!!
//
//        val boldTypeface = ResourcesCompat
//                .getFont(this, R.font.alegreya_bold)!!
//
//        val quote = "I'm selfish, impatient and a little insecure. " +
//                "I make mistakes, I am out of control and at times hard to handle. " +
//                "But if you can't handle me at my worst, " +
//                "then you sure as hell don't deserve me at my best."
//
//        val selfish = "selfish"
//        val impatient = "impatient"
//        val insecure = "insecure"
//        val sureAsHell = "sure as hell"
//
//        val author = "Marilyn Monroe"
//
//        val quoteSpan = SpannableString(quote)
//        quoteSpan.setSpan(CustomQuoteSpan2(this), 0,
//                quote.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//        quoteSpan.setSpan(CustomTypefaceSpan(italicTypeface), 0,
//                quote.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        val color = ForegroundColorSpan(getColor(R.color.colorAccent))
//        quoteSpan.setSpan(color,
//                quote.indexOf(selfish),
//                quote.indexOf(selfish) + selfish.length,
//                SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        // do the same for the other words
//
//        quoteSpan.setSpan(ForegroundColorSpan(getColor(R.color.colorAccent)),
//                quote.indexOf(impatient),
//                quote.indexOf(impatient) + impatient.length,
//                SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        quoteSpan.setSpan(ForegroundColorSpan(getColor(R.color.colorAccent)),
//                quote.indexOf(insecure),
//                quote.indexOf(insecure) + insecure.length,
//                SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        quoteSpan.setSpan(RelativeSizeSpan(1.5f),
//                quote.indexOf(sureAsHell),
//                quote.indexOf(sureAsHell) + sureAsHell.length,
//                SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        quoteSpan.setSpan(BackgroundColorSpan(getColor(R.color.colorAccent)),
//                quote.indexOf(sureAsHell),
//                quote.indexOf(sureAsHell) + sureAsHell.length,
//                SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        quoteSpan.setSpan(ForegroundColorSpan(getColor(R.color.white)),
//                quote.indexOf(sureAsHell),
//                quote.indexOf(sureAsHell) + sureAsHell.length,
//                SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        val authorSpan = SpannableString(author)
//        authorSpan.setSpan(AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE),
//                0, author.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//        authorSpan.setSpan(CustomTypefaceSpan(boldTypeface), 0,
//                author.length, SPAN_EXCLUSIVE_EXCLUSIVE)
//
//
//        val finalText = SpannableStringBuilder()
//        finalText
//                .appendln(quoteSpan)
//                .appendln()
//                .append(authorSpan)
//
//        textView.text = finalText
//    }


    private fun letterSpacingSpan() {

        val italicTypeface = ResourcesCompat
                .getFont(this, R.font.alegreya_italic)!!

        val boldTypeface = ResourcesCompat
                .getFont(this, R.font.alegreya_bold)!!

        val quote = "I'm selfish, impatient and a little insecure. " +
                "I make mistakes, I am out of control and at times hard to handle. " +
                "But if you can't handle me at my worst, " +
                "then you sure as hell don't deserve me at my best."

        val selfish = "selfish"
        val impatient = "impatient"
        val insecure = "insecure"
        val sureAsHell = "sure as hell"

        val author = "Marilyn Monroe"

        val quoteSpan = SpannableString(quote)
        quoteSpan.setSpan(CustomQuoteSpan2(this), 0,
                quote.length, SPAN_EXCLUSIVE_EXCLUSIVE)
        quoteSpan.setSpan(CustomTypefaceSpan(italicTypeface), 0,
                quote.length, SPAN_EXCLUSIVE_EXCLUSIVE)

        val color = ForegroundColorSpan(ContextCompat.getColor(this, R.color.colorAccent))
        quoteSpan.setSpan(color,
                quote.indexOf(selfish),
                quote.indexOf(selfish) + selfish.length,
                SPAN_EXCLUSIVE_EXCLUSIVE)

        // do the same for the other words

        quoteSpan.setSpan(ForegroundColorSpan(ContextCompat.getColor(this, R.color.colorAccent)),
                quote.indexOf(impatient),
                quote.indexOf(impatient) + impatient.length,
                SPAN_EXCLUSIVE_EXCLUSIVE)

        quoteSpan.setSpan(ForegroundColorSpan(ContextCompat.getColor(this, R.color.colorAccent)),
                quote.indexOf(insecure),
                quote.indexOf(insecure) + insecure.length,
                SPAN_EXCLUSIVE_EXCLUSIVE)

        quoteSpan.setSpan(RelativeSizeSpan(1.5f),
                quote.indexOf(sureAsHell),
                quote.indexOf(sureAsHell) + sureAsHell.length,
                SPAN_EXCLUSIVE_EXCLUSIVE)

        quoteSpan.setSpan(BackgroundColorSpan(ContextCompat.getColor(this, R.color.colorAccent)),
                quote.indexOf(sureAsHell),
                quote.indexOf(sureAsHell) + sureAsHell.length,
                SPAN_EXCLUSIVE_EXCLUSIVE)

        quoteSpan.setSpan(ForegroundColorSpan(ContextCompat.getColor(this, R.color.white)),
                quote.indexOf(sureAsHell),
                quote.indexOf(sureAsHell) + sureAsHell.length,
                SPAN_EXCLUSIVE_EXCLUSIVE)

        val authorSpan = SpannableString(author)
        authorSpan.setSpan(AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE),
                0, author.length, SPAN_EXCLUSIVE_EXCLUSIVE)
        authorSpan.setSpan(CustomTypefaceSpan(boldTypeface), 0,
                author.length, SPAN_EXCLUSIVE_EXCLUSIVE)
        authorSpan.setSpan(LetterSpacingSpan(0.15f), 0, author.length,
                SPAN_EXCLUSIVE_EXCLUSIVE)


        val finalText = SpannableStringBuilder()
        finalText
                .appendln(quoteSpan)
                .appendln()
                .append(authorSpan)

        textView.text = finalText

    }

}
