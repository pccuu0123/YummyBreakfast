package com.example.shine.yummybreakfast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        setTitle("註冊");

        final EditText edtaccout=(EditText)findViewById(R.id.edtAccount);
        final EditText edtpwd =(EditText)findViewById(R.id.edtpwd);
        final EditText edtpwd2 = (EditText)findViewById(R.id.edtpwd2);
        final EditText edtmail =(EditText)findViewById(R.id.edtmail);
        final Button btnregister =(Button)findViewById(R.id.btnregister);

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
