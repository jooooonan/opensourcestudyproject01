package com.example.wnsgk.opensourcetest01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.opensourcestudylib.TestPrint;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestPrint testPrint = new TestPrint();



    }
}
