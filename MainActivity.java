package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usernameEditText;
    EditText passwordEditText;
    Button btnSuccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect the components with the layout
        usernameEditText = findViewById(R.id.edt_username);
        passwordEditText = findViewById(R.id.edt_password);
        btnSuccess = findViewById(R.id.btn_success);



        // Set click listener for the "Login Sukses" button
        btnSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLoginClicked();
            }
        });
    }

    public void onLoginClicked() {
        // Get the username and password entered
        String username = usernameEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        // Logic for login success (for demonstration)
        if (!username.isEmpty() && !password.isEmpty()) {
            // Show success message
            Toast.makeText(getApplicationContext(), "Login sukses", Toast.LENGTH_SHORT).show();
        } else {
            // Show error message
            Toast.makeText(getApplicationContext(), "Login gagal, silahkan coba lagi hehe", Toast.LENGTH_SHORT).show();
        }
    }
}