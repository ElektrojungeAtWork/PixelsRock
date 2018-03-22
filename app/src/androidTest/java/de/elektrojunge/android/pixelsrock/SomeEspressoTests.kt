package de.elektrojunge.android.pixelsrock

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.microsoft.appcenter.espresso.Factory
import com.microsoft.appcenter.espresso.ReportHelper
import org.junit.After
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SomeEspressoTests {

    @Rule @JvmField
     var mActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Rule @JvmField
    var reportHelper: ReportHelper = Factory.getReportHelper()

    @Test
    fun buttonsAreVisible() {
        onView(withText("Pick a color!")).check(matches(isDisplayed()))
        onView(withText("Clear!")).check(matches(isDisplayed()))
        reportHelper.label("Both buttons have been verified!")
    }

    @After
    fun tearDown() {
        reportHelper.label("Finished testing buttons")
    }
}