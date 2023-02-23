package com.example.helloworld;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class GreetingTest {

    /*@Test
    public void firstTest() {
        Intent intent = new Intent(Greeting.class.getName());
        ApplicationProvider.getApplicationContext();
        ActivityScenario activityScenario = ActivityScenario.launch(intent);

        ViewInteraction textField = onView(withId(R.id.greetText));
        textField.check(matches());
    }*/
}
