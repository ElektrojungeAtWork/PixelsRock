package de.elektrojunge.android.pixelsrock

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class SomeInstrumentedTestCase {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("de.elektrojunge.android.pixelsrock", appContext.packageName)
    }

    @Test
    fun initPixelWorks() {
        val appContext = InstrumentationRegistry.getTargetContext()
        val sut = Pixel(appContext, Color.LTGRAY, 100)
        assertNotNull(sut)
        assertNotNull(sut.pixelView)
        val background : ColorDrawable = sut.pixelView?.background as ColorDrawable
        assertEquals(Color.LTGRAY, background.color)
    }

}
