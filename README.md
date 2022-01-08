# Android_TextWatcher
Enable Disable Button with Condition 

# Code

#### 1st Activity 
```
EditText userName, password;
Button submit;

userName = findViewById(R.id.usermane);
password = findViewById(R.id.password);
submit = findViewById(R.id.submit);

        userName.addTextChangedListener(textWatcher);
        password.addTextChangedListener(textWatcher);
        
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
```

# App Highlight

<img src="app_images/Enable_Disable Button.png" width="1000" /><br>

<img src="app_images/Enable_Disable Button App1.png" width="300" /> <img src="app_images/Enable_Disable Button App2.png" width="300" /><br>
