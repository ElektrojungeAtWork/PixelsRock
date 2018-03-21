package de.elektrojunge.android.pixelsrock

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.DisplayMetrics
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import eltos.simpledialogfragment.SimpleDialog
import eltos.simpledialogfragment.SimpleDialog.OnDialogResultListener.BUTTON_POSITIVE
import eltos.simpledialogfragment.color.SimpleColorDialog


class MainActivity : AppCompatActivity(), SimpleDialog.OnDialogResultListener {

    private var pickerButton : Button? = null
    private var selectedColor : Int = Color.MAGENTA

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val grid = findViewById<GridLayout>(R.id.pixelGrid)
        val pixelCount = grid.columnCount * grid.columnCount
        var pixels: ArrayList<Pixel> = ArrayList(pixelCount)

        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        var width = displayMetrics.widthPixels / grid.columnCount

        for (i in 0 until pixelCount) {
            val pixel = Pixel(this, Color.LTGRAY, width)
            pixel.pixelView?.setOnTouchListener { _: View, event: MotionEvent ->
                val eventAction = event.action
                when (eventAction) {
                    MotionEvent.ACTION_DOWN -> {
                        pixel.pixelView?.setBackgroundColor(this.selectedColor)
                    }
                    MotionEvent.ACTION_MOVE -> {
                        pixel.pixelView?.setBackgroundColor(this.selectedColor)
                    }
                }

                true
            }
            pixels.add(i, pixel)
            grid.addView(pixel.pixelView)
        }

        this.pickerButton = findViewById<Button>(R.id.colorPickerButton)
        this.pickerButton?.setBackgroundColor(this.selectedColor)
        this.pickerButton?.setOnClickListener{
            SimpleColorDialog.build()
                    .title(R.string.colorPickerButton)
                    .colorPreset(this.selectedColor)
                    .allowCustom(true)
                    .show(this, getString(R.string.tag_color_picker_dialog))
        }
    }

    // Color Picker onnResult callback
    override fun onResult(dialogTag: String, which: Int, extras: Bundle): Boolean {
        if (which == BUTTON_POSITIVE) {
            this.selectedColor = extras.getInt(SimpleColorDialog.COLOR)
            this.pickerButton?.setBackgroundColor(this.selectedColor)
            return true
        }

        return false
    }
}
