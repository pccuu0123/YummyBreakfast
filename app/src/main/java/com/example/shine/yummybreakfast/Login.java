package com.example.shine.yummybreakfast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        setTitle("登入");

        final EditText edtAccount2 = (EditText)findViewById(R.id.edtAccount2);
        final EditText edtpwd3 =(EditText)findViewById(R.id.edtpwd3);
        final Button btnlogin = (Button)findViewById(R.id.btnlogin);
        final Button btnfacebook = (Button)findViewById(R.id.btnfacebook);
        final Button btngoogle = (Button)findViewById(R.id.btngoogle);
        final Button btnregister2 = (Button)findViewById(R.id.btnregister2);

        btnregister2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(Login.this,Register.class);
                Login.this.startActivity(registerIntent);
            }
        });
        //add back button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == android.R.id.home)
        {
            //ends the activity
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
