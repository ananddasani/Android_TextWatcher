package com.example.enable_disableedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText userName, password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.usermane);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.submit);

        userName.addTextChangedListener(textWatcher);
        password.addTextChangedListener(textWatcher);
    }

    //creating textWatcher for here because we are having 2 edit text
    //so 1 common for both
    TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            //get input from both editText and check for empty or not
            String userNameInput = userName.getText().toString().trim();
            String passwordInput = password.getText().toString().trim();

            submit.setEnabled(!userNameInput.isEmpty() && !passwordInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}