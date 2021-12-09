package com.example.ansalna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    AppCompatButton b1,b2;
    String name,address,phonenumber,emailid,username,password,conformpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText)findViewById(R.id.Name);
        ed2=(EditText)findViewById(R.id.Address);
        ed3=(EditText)findViewById(R.id.phonenumber);
        ed4=(EditText)findViewById(R.id.emailid);
        ed5=(EditText)findViewById(R.id.username);
        ed6=(EditText)findViewById(R.id.password);
        ed7=(EditText)findViewById(R.id.conformpassword);
          b1=(AppCompatButton)findViewById(R.id.register);
          b1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  name=ed1.getText().toString();
                  Toast.makeText(getApplicationContext(), "name", Toast.LENGTH_SHORT).show();
                  address=ed2.getText().toString();
                  Toast.makeText(getApplicationContext(), "address", Toast.LENGTH_SHORT).show();
                  phonenumber=ed3.getText().toString();
                  Toast.makeText(getApplicationContext(), "phonenumber", Toast.LENGTH_SHORT).show();
                  emailid=ed4.getText().toString();
                  Toast.makeText(getApplicationContext(), "emailid", Toast.LENGTH_SHORT).show();
                  username=ed5.getText().toString();
                  Toast.makeText(getApplicationContext(), "username", Toast.LENGTH_SHORT).show();
                  password=ed6.getText().toString();
                  Toast.makeText(getApplicationContext(), "password", Toast.LENGTH_SHORT).show();
                  conformpassword=ed7.getText().toString();
                  Toast.makeText(getApplicationContext(), "conformpassword", Toast.LENGTH_SHORT).show();
              }
          });

        b2=(AppCompatButton)findViewById(R.id.backtoregister);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}