package com.example.showname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button myButton;
    private TextView showText;
    private EditText firstName, lastName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.button);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstname = firstName.getText().toString();
                String lastname = lastName.getText().toString();
                showText.setText("Hello! " + firstname + " " + lastname);
            }
        });

        showText = findViewById(R.id.textView);

    }
}
