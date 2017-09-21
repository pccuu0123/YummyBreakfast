package com.example.shine.yummybreakfast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class UserArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userarea);

        final EditText edtusername = (EditText)findViewById(R.id.edtusername);
        final Button btnok = (Button)findViewById(R.id.btnOK);
    }
}
