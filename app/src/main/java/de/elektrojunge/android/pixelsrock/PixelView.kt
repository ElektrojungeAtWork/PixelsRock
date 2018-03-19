package de.elektrojunge.android.pixelsrock

import android.content.Context
import android.support.v7.widget.AppCompatImageView

class PixelView(context: Context?, private val size: Int) : AppCompatImageView(context) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        setMeasuredDimension(size, size)
    }
}