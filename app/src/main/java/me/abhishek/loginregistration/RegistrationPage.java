package me.abhishek.loginregistration;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationPage extends AppCompatActivity implements View.OnClickListener {

    Button  bRegister;
    EditText etFullName, etUserName, etPassword, etAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        etFullName=(EditText) findViewById(R.id.etFullName);
        etUserName=(EditText) findViewById(R.id.etUserName);
        etPassword=(EditText)findViewById(R.id.etPassword);
        etAge=(EditText)findViewById(R.id.etAge);

        bRegister=(Button)findViewById(R.id.btRegister);
        bRegister.setOnClickListener(this);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btRegister:

                break;
        }

    }


}
