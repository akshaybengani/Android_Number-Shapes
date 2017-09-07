package com.akshaybengani.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view)
    {
        EditText valueDoller;
        double amountRs,amountDoller;
        valueDoller=(EditText) findViewById(R.id.doller);
        amountDoller=Double.parseDouble(valueDoller.getText().toString());
        amountRs=amountDoller*64;
        Toast.makeText(MainActivity.this,""+amountRs, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
