package com.example.bootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToGreeting(View view) {
        EditText sendText = findViewById(R.id.nameField);
        String name = sendText.getText().toString();
        String greet = "Good morning, " + name;

        Intent intent = new Intent(this, Greeting.class);
        intent.putExtra("key", greet);
        startActivity(intent);
    }
}