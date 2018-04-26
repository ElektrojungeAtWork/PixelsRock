package de.elektrojunge.android.pixelsrock

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.DisplayMetrics
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.analytics.Analytics.trackEvent
import com.microsoft.appcenter.crashes.Crashes
import eltos.simpledialogfragment.SimpleDialog
import eltos.simpledialogfragment.SimpleDialog.OnDialogResultListener.BUTTON_POSITIVE
import eltos.simpledialogfragment.color.SimpleColorDialog


class MainActivity : AppCompatActivity(), SimpleDialog.OnDialogResultListener {

    private var pickerButton: Button? = null
    private var clearButton: Button? = null
    private var selectedColor: Int = Color.MAGENTA

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize App Center SDK
        AppCenter.start(application, "55efc107-ee0c-40e4-a4e7-e4f283b59b2e",
                Analytics::class.java, Crashes::class.java)


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
        this.pickerButton?.setOnClickListener {
            SimpleColorDialog.build()
                    .title(R.string.colorPickerButton)
                    .colorPreset(this.selectedColor)
                    .allowCustom(true)
                    .show(this, getString(R.string.tag_color_picker_dialog))
            trackEvent("button_color_picker_hit")
        }

        this.clearButton = findViewById<Button>(R.id.clearButton)
        this.clearButton?.setBackgroundColor(Color.DKGRAY)
        this.clearButton?.setOnClickListener {
            for (pixel: Pixel in pixels) {
                pixel.color = Color.LTGRAY
            }
        }

    }

    // Color Picker onResult callback
    override fun onResult(dialogTag: String, which: Int, extras: Bundle): Boolean {
        if (which == BUTTON_POSITIVE) {
            this.selectedColor = extras.getInt(SimpleColorDialog.COLOR)
            this.pickerButton?.setBackgroundColor(this.selectedColor)
            val properties: Map<String, String> = hashMapOf("color" to
                    Color.valueOf(this.selectedColor).toString())
            trackEvent("color_picker_color_selected", properties)
            return true
        }

        return false
    }
}
