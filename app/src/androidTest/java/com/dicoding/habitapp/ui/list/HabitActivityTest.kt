package com.dicoding.habitapp.ui.list

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.dicoding.habitapp.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

//TODO 16 : Write UI test to validate when user tap Add Habit (+), the AddHabitActivity displayed
@RunWith(AndroidJUnit4::class)
class HabitActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(HabitListActivity::class.java)

    @Test
    fun testOpenAddHabitActivity() {
        onView(withId(R.id.fab)).perform(click())

        onView(withId(R.id.add_task)).check(matches(isDisplayed()))
    }
}