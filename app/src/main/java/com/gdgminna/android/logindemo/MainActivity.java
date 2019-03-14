package com.gdgminna.android.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText email, password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button)findViewById(R.id.login);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);

    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(email.getText().toString().equals("admin") &&
                    password.getText().toString().equals("admin")) {
                Toast.makeText(getApplicationContext(),
                        "Login Successful",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), FlashLightActivity.class);
                startActivity(intent);

            }else{
                Toast.makeText(getApplicationContext(), "Wrong Credentials try Again",Toast.LENGTH_SHORT).show();
}
        }
    }
    );
    }
}