package de.elektrojunge.android.pixelsrock

import android.content.Context

class Pixel(context: Context?, color: Int, size: Int) {
    var color: Int = color
        get() = color
        set(value) {
            field = value
            pixelView?.setBackgroundColor(color)
        }
    var pixelView: PixelView? = null

    init {
        this.pixelView = PixelView(context, size)
        this.pixelView?.setBackgroundColor(color)
    }

}